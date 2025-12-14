package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Calculator class
 * Demonstrates comprehensive testing for CI/CD pipeline
 */
@DisplayName("Calculator Tests")
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addition with positive numbers")
    public void testAddition() {
        assertEquals(8, calculator.add(5, 3), "5 + 3 should equal 8");
        assertEquals(0, calculator.add(-5, 5), "-5 + 5 should equal 0");
        assertEquals(100, calculator.add(50, 50), "50 + 50 should equal 100");
    }

    @Test
    @DisplayName("Test subtraction with various numbers")
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equal 2");
        assertEquals(-10, calculator.subtract(0, 10), "0 - 10 should equal -10");
        assertEquals(25, calculator.subtract(50, 25), "50 - 25 should equal 25");
    }

    @Test
    @DisplayName("Test multiplication including zero")
    public void testMultiplication() {
        assertEquals(15, calculator.multiply(5, 3), "5 * 3 should equal 15");
        assertEquals(0, calculator.multiply(5, 0), "5 * 0 should equal 0");
        assertEquals(-20, calculator.multiply(4, -5), "4 * -5 should equal -20");
    }

    @Test
    @DisplayName("Test division with valid divisors")
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should equal 2.0");
        assertEquals(2.5, calculator.divide(5, 2), "5 / 2 should equal 2.5");
        assertEquals(-3.0, calculator.divide(9, -3), "9 / -3 should equal -3.0");
    }

    @Test
    @DisplayName("Test division by zero throws exception")
    public void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Test even number detection")
    public void testIsEven() {
        assertTrue(calculator.isEven(4), "4 should be even");
        assertFalse(calculator.isEven(7), "7 should not be even");
        assertTrue(calculator.isEven(0), "0 should be even");
        assertTrue(calculator.isEven(-6), "-6 should be even");
        assertFalse(calculator.isEven(-3), "-3 should not be even");
    }
}