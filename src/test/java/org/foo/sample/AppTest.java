package org.foo.sample;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void shouldBeEqual() {
    assertTrue(org.foo.sample.App.checkEquals(42, 42));
  }

  @Test
  public void shouldBeInequal() {
    assertFalse(org.foo.sample.App.checkEquals(41, 42));
  }
}