package ejercicios.ejercicio3;

public class PrimeReward {
    private ServicePrime service;

    public PrimeReward() {
        service = new ServicePrime();
    }

    public void setService(ServicePrime service) {
        this.service = service;
    }

    public int getPremio(int edad){
        int result;
        if (service.isPrime(edad)) {
            result = edad <= 10 ? edad*100 : edad*80;
        } else{
            result = edad;
        }
        return  result;
    }

}
