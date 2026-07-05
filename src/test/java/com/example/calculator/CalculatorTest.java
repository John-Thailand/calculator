package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
  @Test
  void addReturnsCorrectResult() {
    Calculator calculator = new Calculator();
    int result = calculator.add(10, 20);
    assertEquals(30, result);
  }

  @Test
  void subtractReturnsCorrectResult() {
    Calculator calculator = new Calculator();
    int result = calculator.subtract(20, 5);
    assertEquals(15, result);
  }

  @Test
  void multiplyReturnsCorrectResult() {
    Calculator calculator = new Calculator();
    int result = calculator.multiply(5, 6);
    assertEquals(30, result);
  }

  @Test
  void divideReturnsCorrectResult() {
    Calculator calculator = new Calculator();
    int result = calculator.divide(20, 4);
    assertEquals(5, result);
  }
}
