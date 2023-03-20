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
        assertNotEquals("Finding factorial for False Positive", 20, calculator.factorial(5), DELTA);
    }

    @Test
    public void squarerootTruePositive(){
        assertEquals("Finding sqaure root for True Positive", 2, calculator.squareroot(4), DELTA);
        assertEquals("Finding sqaure root for True Positive", 1, calculator.squareroot(1), DELTA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 10, calculator.squareroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 20, calculator.squareroot(4), DELTA);
    }
    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 64, calculator.power(4,3), DELTA);
        assertEquals("Finding power for True Positive", 1, calculator.power(2,0), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 10, calculator.power(3,5), DELTA);
        assertNotEquals("Finding power for False Positive", 20, calculator.power(4,2), DELTA);
    }
    @Test
    public void logTruePositive(){
        assertEquals("Finding log for True Positive", 1.6094379124341003, calculator.log(5), DELTA);
        assertEquals("Finding log for True Positive", 0, calculator.log(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding log for False Positive", 10, calculator.log(3), DELTA);
        assertNotEquals("Finding log for False Positive", 20, calculator.log(4), DELTA);
    }
}
