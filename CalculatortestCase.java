import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmartCalculatorTestCase {

    @Test
    void testCalculateSimpleInterest() {
        SmartCalculatorTest calculator = new SmartCalculatorTest();
        calculator.setPrincipal(1000);
        calculator.setRate(5);
        calculator.setTime(2);
        assertEquals(100, calculator.calculateSimpleInterest(), 0.01);
    }

    @Test
    void testCalculateCompoundInterest() {
        SmartCalculatorTest calculator = new SmartCalculatorTest();
        calculator.setPrincipal(1000);
        calculator.setRate(5);
        calculator.setTime(2);
        assertEquals(102.50, calculator.calculateCompoundInterest(), 0.01);
    }

    @Test
    void testCalculateMean() {
        SmartCalculatorTest calculator = new SmartCalculatorTest();
        calculator.setNumbers(new double[]{2, 4, 6, 8, 10});
        assertEquals(6, calculator.calculateMean(), 0.01);
    }

    @Test
    void testCalculateFactorial() {
        SmartCalculatorTest calculator = new SmartCalculatorTest();
        assertEquals(120, calculator.calculateFactorial(5));
    }

    @Test
    void testCalculatePercentage() {
        SmartCalculatorTest calculator = new SmartCalculatorTest();
        calculator.setMarksObtained(75);
        calculator.setTotalMarks(100);
        assertEquals(75, calculator.calculatePercentage(), 0.01);
    }
}
