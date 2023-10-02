package testPrime;

import ejercicios.ejercicio3.PrimeReward;
import ejercicios.ejercicio3.ServicePrime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PrimeRewardTest {

    public ServicePrime serviceMock = Mockito.mock(ServicePrime.class);

    @Test
    public void verifygetPremio(){
        Mockito.when(serviceMock.isPrime(5)).thenReturn(true);

        PrimeReward reward = new PrimeReward();
        reward.setService(serviceMock);
        int actual = reward.getPremio(5);
        int expected = 500;
        Assertions.assertEquals(expected, actual, "Error!");
    }
}
