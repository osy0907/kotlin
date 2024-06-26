/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.compiler;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJava8TestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class LoadJava8TestGenerated extends AbstractLoadJava8Test {
  @TestMetadata("compiler/testData/loadJava8/compiledJava")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class CompiledJava extends AbstractLoadJava8Test {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTestCompiledJava, this, testDataFilePath);
    }

    public void testAllFilesPresentInCompiledJava() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledJava"), Pattern.compile("^(.+)\\.java$"), null, true);
    }

    @TestMetadata("InnerClassTypeAnnotation.java")
    public void testInnerClassTypeAnnotation() {
      runTest("compiler/testData/loadJava8/compiledJava/InnerClassTypeAnnotation.java");
    }

    @TestMetadata("MapRemove.java")
    public void testMapRemove() {
      runTest("compiler/testData/loadJava8/compiledJava/MapRemove.java");
    }

    @TestMetadata("ParameterNames.java")
    public void testParameterNames() {
      runTest("compiler/testData/loadJava8/compiledJava/ParameterNames.java");
    }

    @TestMetadata("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeParameterAnnotations extends AbstractLoadJava8Test {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTestCompiledJava, this, testDataFilePath);
      }

      public void testAllFilesPresentInTypeParameterAnnotations() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
      }

      @TestMetadata("Basic.java")
      public void testBasic() {
        runTest("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations/Basic.java");
      }

      @TestMetadata("Basic_DisabledImprovements.java")
      public void testBasic_DisabledImprovements() {
        runTest("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations/Basic_DisabledImprovements.java");
      }
    }

    @TestMetadata("compiler/testData/loadJava8/compiledJava/typeUseAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeUseAnnotations extends AbstractLoadJava8Test {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTestCompiledJava, this, testDataFilePath);
      }

      public void testAllFilesPresentInTypeUseAnnotations() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledJava/typeUseAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
      }

      @TestMetadata("BaseClassTypeArguments.java")
      public void testBaseClassTypeArguments() {
        runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/BaseClassTypeArguments.java");
      }

      @TestMetadata("Basic.java")
      public void testBasic() {
        runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/Basic.java");
      }

      @TestMetadata("Basic_DisabledImprovements.java")
      public void testBasic_DisabledImprovements() {
        runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/Basic_DisabledImprovements.java");
      }

      @TestMetadata("ClassTypeParameterBounds.java")
      public void testClassTypeParameterBounds() {
        runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/ClassTypeParameterBounds.java");
      }

      @TestMetadata("MethodReceiver.java")
      public void testMethodReceiver() {
        runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/MethodReceiver.java");
      }

      @TestMetadata("MethodTypeParameterBounds.java")
      public void testMethodTypeParameterBounds() {
        runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/MethodTypeParameterBounds.java");
      }

      @TestMetadata("ReturnType.java")
      public void testReturnType() {
        runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/ReturnType.java");
      }

      @TestMetadata("ValueArguments.java")
      public void testValueArguments() {
        runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/ValueArguments.java");
      }
    }
  }

  @TestMetadata("compiler/testData/loadJava8/compiledKotlinWithStdlib")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class CompiledKotlinWithStdlib extends AbstractLoadJava8Test {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTestCompiledKotlinWithStdlib, this, testDataFilePath);
    }

    public void testAllFilesPresentInCompiledKotlinWithStdlib() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledKotlinWithStdlib"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("compiler/testData/loadJava8/compiledKotlinWithStdlib/annotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Annotations extends AbstractLoadJava8Test {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTestCompiledKotlinWithStdlib, this, testDataFilePath);
      }

      public void testAllFilesPresentInAnnotations() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledKotlinWithStdlib/annotations"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("RepeatableAnnotationWithExplicitContainer.kt")
      public void testRepeatableAnnotationWithExplicitContainer() {
        runTest("compiler/testData/loadJava8/compiledKotlinWithStdlib/annotations/RepeatableAnnotationWithExplicitContainer.kt");
      }

      @TestMetadata("RepeatableAnnotationWithImplicitContainer.kt")
      public void testRepeatableAnnotationWithImplicitContainer() {
        runTest("compiler/testData/loadJava8/compiledKotlinWithStdlib/annotations/RepeatableAnnotationWithImplicitContainer.kt");
      }
    }
  }

  @TestMetadata("compiler/testData/loadJava8/sourceJava")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class SourceJava extends AbstractLoadJava8Test {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTestSourceJava, this, testDataFilePath);
    }

    public void testAllFilesPresentInSourceJava() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/sourceJava"), Pattern.compile("^(.+)\\.java$"), null, true);
    }

    @TestMetadata("MapRemove.java")
    public void testMapRemove() {
      runTest("compiler/testData/loadJava8/sourceJava/MapRemove.java");
    }

    @TestMetadata("TypeParameterAnnotations.java")
    public void testTypeParameterAnnotations() {
      runTest("compiler/testData/loadJava8/sourceJava/TypeParameterAnnotations.java");
    }

    @TestMetadata("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeParameterAnnotations extends AbstractLoadJava8Test {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTestSourceJava, this, testDataFilePath);
      }

      public void testAllFilesPresentInTypeParameterAnnotations() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
      }

      @TestMetadata("Basic.java")
      public void testBasic() {
        runTest("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations/Basic.java");
      }

      @TestMetadata("Basic_DisabledImprovements.java")
      public void testBasic_DisabledImprovements() {
        runTest("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations/Basic_DisabledImprovements.java");
      }
    }

    @TestMetadata("compiler/testData/loadJava8/sourceJava/typeUseAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeUseAnnotations extends AbstractLoadJava8Test {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTestSourceJava, this, testDataFilePath);
      }

      public void testAllFilesPresentInTypeUseAnnotations() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/sourceJava/typeUseAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
      }

      @TestMetadata("BaseClassTypeArguments.java")
      public void testBaseClassTypeArguments() {
        runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/BaseClassTypeArguments.java");
      }

      @TestMetadata("Basic.java")
      public void testBasic() {
        runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/Basic.java");
      }

      @TestMetadata("Basic_DisabledImprovements.java")
      public void testBasic_DisabledImprovements() {
        runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/Basic_DisabledImprovements.java");
      }

      @TestMetadata("ClassTypeParameterBounds.java")
      public void testClassTypeParameterBounds() {
        runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/ClassTypeParameterBounds.java");
      }

      @TestMetadata("MethodReceiver.java")
      public void testMethodReceiver() {
        runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/MethodReceiver.java");
      }

      @TestMetadata("MethodTypeParameterBounds.java")
      public void testMethodTypeParameterBounds() {
        runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/MethodTypeParameterBounds.java");
      }

      @TestMetadata("ReturnType.java")
      public void testReturnType() {
        runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/ReturnType.java");
      }

      @TestMetadata("ValueArguments.java")
      public void testValueArguments() {
        runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/ValueArguments.java");
      }
    }
  }
}
