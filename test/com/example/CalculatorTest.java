package com.example;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Chạy trước mỗi test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Bắt đầu test...");
    }

    // Chạy sau mỗi test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Kết thúc test...");
    }

    // Test phép cộng
    @Test
    public void testAdd() {
        System.out.println("Test phép cộng");
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-5, calculator.add(-2, -3));
    }

    // Test phép trừ
    @Test
    public void testSubtract() {
        System.out.println("Test phép trừ");
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-2, calculator.subtract(3, 5));
        assertEquals(0, calculator.subtract(0, 0));
    }

    // Test phép nhân
    @Test
    public void testMultiply() {
        System.out.println("Test phép nhân");
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    // Test phép chia
    @Test
    public void testDivide() {
        System.out.println("Test phép chia");
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(3, calculator.divide(9, 3));
    }

    // Test chia cho 0 (mong đợi lỗi)
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        System.out.println("Test chia cho 0");
        calculator.divide(10, 0);
    }

    // Test số chẵn
    @Test
    public void testIsEven() {
        System.out.println("Test số chẵn");
        assertTrue(calculator.isEven(2));
        assertTrue(calculator.isEven(0));
        assertFalse(calculator.isEven(3));
    }
}