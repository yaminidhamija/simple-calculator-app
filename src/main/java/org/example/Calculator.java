package org.example;

/**
 * Simple Calculator class for GitHub Actions Workshop
 * Demonstrates basic arithmetic operations with proper error handling
 */
public class Calculator {

    /**
     * Adds two integers
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts two integers
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integers
     * @param a Dividend
     * @param b Divisor
     * @return Quotient of a and b
     * @throws IllegalArgumentException if divisor is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    /**
     * Checks if a number is even
     * @param number Number to check
     * @return true if even, false if odd
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Main method for demonstration
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== Calculator Demo ===");
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("15 / 3 = " + calc.divide(15, 3));
        System.out.println("Is 8 even? " + calc.isEven(8));
        System.out.println("Is 7 even? " + calc.isEven(7));
    }
}