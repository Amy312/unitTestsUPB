package example1;

import clases.examples.example1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorParamTest {
    @ParameterizedTest
    @CsvSource({
            "2,2,4",
            "2,3,5",
            "0,2,2",
            "-5,4,-1",
            "0,0,0",
            "200,20,220",
            "3,2,5"
    })
    public void verifyAditionPar(int numberA, int numberB, int expectedResult){
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(numberA,numberB);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR, incorret result");
    }
}
