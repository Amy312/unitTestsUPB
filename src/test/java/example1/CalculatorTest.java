package example1;

import clases.examples.example1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void verifyAditionPar(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(2,2);
        int expectedResult = 4;
        Assertions.assertEquals(expectedResult, actualResult, "ERROR, incorret result");
    }

    @Test
    public void verifyAditionImpar(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(3,3);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult, actualResult, "ERROR, incorret result");
    }
    @Test
    public void verifyAditionImparPar(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(2,3);
        int expectedResult = 5;
        Assertions.assertEquals(expectedResult, actualResult, "ERROR, incorret result");
    }
}
