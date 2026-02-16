package com.example;

public class Calculator {

    // Phép cộng
    public int add(int a, int b) {
        return a + b;
    }

    // Phép trừ
    public int subtract(int a, int b) {
        return a - b;
    }

    // Phép nhân
    public int multiply(int a, int b) {
        return a * b;
    }

    // Phép chia
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return a / b;
    }
    // them method  t2
    public int square(int x) {
        return x * x;
    }
    // Kiểm tra số chẵn
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Main method để chạy thử
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== DEMO CALCULATOR ===");
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("5 - 3 = " + calc.subtract(5, 3));
        System.out.println("5 * 3 = " + calc.multiply(5, 3));
        System.out.println("6 / 3 = " + calc.divide(6, 3));
        System.out.println("7 có phải số chẵn? " + calc.isEven(7));
    }
}