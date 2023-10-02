package testPalindrome;

import ejercicios.ejercicio4.ServiceP;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ServicePTest {

    ServiceP serviceP = new ServiceP();

    @ParameterizedTest
    @CsvSource({
            "jose, false",
            "oro, true",
            "pan, false",
            "nan, true",
            "awiwa, true",
            "12345678987654321, true"
    })
    public void verifyIsPalindrome(String value, boolean expected){
        Boolean actual = serviceP.isPalindrome(value);
        Assertions.assertEquals(expected, actual, "error! resultado incorrecto");
    }

    @Test
    public void verifyException() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            serviceP.isPalindrome(null);
        });
    }
}
