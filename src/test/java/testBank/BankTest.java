package testBank;

import ejercicios.ejercicio5.Bank;
import ejercicios.ejercicio5.ServiceBank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class BankTest {

        ServiceBank serviceMock = Mockito.mock(ServiceBank.class);
        Bank bank = new Bank();




    @ParameterizedTest
    @CsvSource({
            "454566, A, CI:454566 maximo a prestar 200000",
            "1233333, B, CI:1233333 maximo a prestar 100000",
            "111, CI inválido, CI inválido",
            "231142, A, CI:231142 maximo a prestar 200000",
            "999999, B, CI:999999 maximo a prestar 100000",
            "777477, C, no se puede prestar ningún monto ALERTA!",
            "454566A, CI inválido, CI inválido",
            "1233333, B, CI:1233333 maximo a prestar 100000",
            "ACBDFD, CI inválido, CI inválido",
            "232342, A, CI:232342 maximo a prestar 200000",
            "99a9999, CI inválido, CI inválido",
            "77777, C, no se puede prestar ningún monto ALERTA!"
    })
    public void verifyGetMáximoPrestamo(String ci, String category, String expected){
        Mockito.when(serviceMock.getCategoria(ci)).thenReturn(category);

        bank.setService(serviceMock);

        String actual = bank.getMaximoPrestamo(ci);
        Assertions.assertEquals(expected, actual, "Error!, Resultado incorrecto");
        Mockito.verify(serviceMock).getCategoria(ci);
    }

    @Test
    public void verifyException() throws Exception {
        Assertions.assertThrows(Exception.class, () -> {
            bank.getMaximoPrestamo(null);
        });
    }

}
