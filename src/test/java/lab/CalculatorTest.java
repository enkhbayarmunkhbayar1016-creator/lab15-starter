package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-1, 1));
        assertEquals(-3, calc.add(-1, -2));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
        assertEquals(-2, calc.subtract(0, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(0, 100));
        assertEquals(-6, calc.multiply(-2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(6, 3));
        assertEquals(0.5, calc.divide(1, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }
}
