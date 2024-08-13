package io.tnec.javaparsing;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.body.MethodDeclaration;

public class Main {

    private static final String TEST_CASE = """
/**
 * Tests for correct dependency retrieval with maven rules.
 */
public class MainTest {

  @Test
  public void dummyMethod_returns17() throws Exception {
    assertEquals("should return 17", 17, Main.dummyMethod());
  }
  @Test
  public void dummyMethod_returns18() throws Exception {
    assertEquals("should return 18", 18, Main.dummyMethod());
  }
  }
    """;

    public static void main(String[] args) {
        var ast = StaticJavaParser.parse(TEST_CASE);
        ast.findAll(MethodDeclaration.class).forEach(method -> {
            System.out.println("Method name: " + method.getName());
            System.out.println("Method body: " + method.getBody().get());
        });
        System.out.println("Hello, World!");
    }

    public static int dummyMethod() {
        return 17;
    }
}
