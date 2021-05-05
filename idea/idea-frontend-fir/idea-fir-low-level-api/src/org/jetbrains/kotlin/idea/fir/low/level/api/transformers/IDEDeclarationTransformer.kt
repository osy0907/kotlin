/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api.transformers

import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.declarations.FirDeclaration
import org.jetbrains.kotlin.fir.render
import org.jetbrains.kotlin.fir.resolve.transformers.FirAbstractPhaseTransformer
import org.jetbrains.kotlin.fir.visitors.FirTransformer
import org.jetbrains.kotlin.idea.fir.low.level.api.api.FirDeclarationDesignation

private class FirDesignationIterator(val designation: List<FirDeclaration>) {
    private var currentIndex = 0

    val hasDeclaration: Boolean get() = currentIndex <= designation.lastIndex
    val isTargetDeclaration: Boolean get() = currentIndex == designation.lastIndex
    val currentDeclaration: FirDeclaration get() = designation[currentIndex]

    fun advance() {
        if (hasDeclaration) {
            currentIndex++
        } else {
            throw IndexOutOfBoundsException()
        }
    }
}

internal class IDEDeclarationTransformer(private val designation: FirDeclarationDesignation) {
    //private val designationIterator = FirDesignationIterator(designation.toSequence(includeFile = false, includeTarget = true).toList())
    private val designationWithoutTargetIterator = designation.toSequence(includeTarget = false).iterator()
    private var isInsideTargetDeclaration: Boolean = false

//    private inline fun <R> insideTargetDeclaration(insideCurrent: Boolean, action: () -> R): R {
//        val oldValue = isInsideTargetDeclaration
//        isInsideTargetDeclaration = insideCurrent
//        try {
//            return action()
//        } finally {
//            isInsideTargetDeclaration = oldValue
//        }
//    }

    inline fun <K, D> transformDeclarationContent(
        transformer: FirAbstractPhaseTransformer<D>,
        declaration: K,
        data: D,
        transformDeclaration: (K, D) -> K
    ): K {

        if (isInsideTargetDeclaration) {
            return transformDeclaration(declaration, data)
        }

        if (designationWithoutTargetIterator.hasNext()) {
            designationWithoutTargetIterator.next().visitNoTransform(transformer, data)
        } else {
            try {
                isInsideTargetDeclaration = true
                designation.declaration.visitNoTransform(transformer, data)
            } finally {
                isInsideTargetDeclaration = false
            }
        }

        return declaration
    }
//
//    fun <K, D> transformDeclarationContent(
//        transformer: FirAbstractPhaseTransformer<D>,
//        declaration: K,
//        data: D,
//        transformDeclaration: (K, D) -> K
//    ): K {
//        return if (designationIterator.hasDeclaration) {
//            val declarationToTransform = designationIterator.currentDeclaration
//            val isTargetDeclaration = designationIterator.isTargetDeclaration
//            designationIterator.advance()
//            insideTargetDeclaration(isTargetDeclaration) {
//                declarationToTransform.visitNoTransform(transformer, data)
//            }
//            declaration
//        } else {
//            if (isInsideTargetDeclaration) {
//                transformDeclaration(declaration, data)
//            } else {
//                declaration
//            }
//        }
//    }

    val needReplacePhase: Boolean get() = isInsideTargetDeclaration
}

private fun <D> FirElement.visitNoTransform(transformer: FirTransformer<D>, data: D) {
    val result = this.transform<FirElement, D>(transformer, data)
    require(result === this) { "become $result `${result.render()}`, was ${this}: `${this.render()}`" }
}
