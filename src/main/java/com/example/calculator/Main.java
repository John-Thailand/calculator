package com.example.calculator;

public class Main {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("使い方：");
      System.out.println("java -jar calculator.jar <add|subtract|multiply|divide> <数字1> <数字2>");
      return;
    }

    String operation = args[0];

    int a = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    Calculator calculator = new Calculator();

    int result = 0;

    switch (operation) {
      case "add":
        result = calculator.add(a, b);
        System.out.println(a + " + " + b + " = " + result);
        break;
      case "subtract":
        result = calculator.subtract(a, b);
        System.out.println(a + " - " + b + " = " + result);
        break;
      case "multiply":
        result = calculator.multiply(a, b);
        System.out.println(a + " * " + b + " = " + result);
        break;
      case "divide":
        result = calculator.divide(a, b);
        System.out.println(a + " / " + b + " = " + result);
        break;
      default:
        System.out.println("対応していない演算です。");
    }
  }
}
