import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial for True Positive", 1, calculator.factorial(0), DELTA);
        assertEquals("Finding factorial for True Positive", 3628800, calculator.factorial(10), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial for False Positive", 120, calculator.factorial(4), DELTA);
        assertNotEquals("Finding factorial for False Positive", 120, calculator.factorial(5), DELTA);
    }
}
