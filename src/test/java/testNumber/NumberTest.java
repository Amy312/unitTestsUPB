package testNumber;

import ejercicios.ejercicio2.Number;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberTest {
    @ParameterizedTest
    @CsvSource(
            {
                    "-1,Valor Incorrecto",
                    "0,0",
                    "1,1",
                    "10,01",
                    "100,001",
                    "8,8",
                    "80,08",
                    "123,321",
                    "1967,7691",
                    "256722,227652",
                    "1329204,4029231",
                    "9000000, 0000009",
                    "132920400,004029231",
                    "900000099, 990000009",
                    "123456789,987654321",
                    "987654321,123456789",
                    "2147483647, 7463847412"
            }
    )
    public void verifyGetReverse(int notaValue, String expectedResult) {
        Number number = new Number();
        String actualResult = number.getReverse(notaValue);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR!el mensaje es incorrecto");
    }
}
