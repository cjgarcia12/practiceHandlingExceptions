package org.example;

public class Calculator {
    private int num1;
    private int num2;

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid input: n and k must be non-negative and k must not exceed n.");
        }

        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.factorial(5));
        System.out.println(calculator.binomialCoefficient(5, 3));
    }
}
