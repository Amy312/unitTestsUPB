package testMock;

import clases.mocksExample.CalculatorAdvanced;
import clases.mocksExample.ServiceCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorAdvancedTestBad {

    @Test
    public void verifyFactorial(){
        CalculatorAdvanced calculatorAdvanced = new CalculatorAdvanced();
        int actual = calculatorAdvanced.getFactorial(3);
        int expected = -6;
        Assertions.assertEquals(expected, actual, "Esta mal");
    }}
