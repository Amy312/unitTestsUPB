package testMock;

import clases.mocksExample.CalculatorAdvanced;
import clases.mocksExample.ServiceCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class CalculatorAdvancedTest {
    public ServiceCalc serviceCalcMock = Mockito.mock(ServiceCalc.class);

    @Test
    public void verifyFactorial(){
        Mockito.when(serviceCalcMock.mult(1,1)).thenReturn(1);
        Mockito.when(serviceCalcMock.mult(1,2)).thenReturn(2);
        Mockito.when(serviceCalcMock.mult(2,3)).thenReturn(6);

        CalculatorAdvanced calculatorAdvanced = new CalculatorAdvanced();
        calculatorAdvanced.setCalcService(serviceCalcMock);
        int actual = calculatorAdvanced.getFactorial(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual, "Error: Factorial incorrecto");
    }

}
