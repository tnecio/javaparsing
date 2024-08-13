package io.tnec.javaparsing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Tests for correct dependency retrieval with maven rules.
 */
public class MainTest {

  @Test
  public void dummyMethod_returns17() throws Exception {
    assertEquals("should return 17", 17, Main.dummyMethod());
  }

}
