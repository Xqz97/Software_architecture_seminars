package calculator;

import Seminar12.calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {


    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2,1);
        assertEquals(4, result);
    }
}
