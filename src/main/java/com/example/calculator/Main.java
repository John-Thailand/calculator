package com.example.calculator;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    int a = 10;
    int b = 20;

    int result = calculator.add(a, b);

    System.out.println(a + " + " + b + " = " + result);
  }
}
