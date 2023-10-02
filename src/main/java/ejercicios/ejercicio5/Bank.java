package ejercicios.ejercicio5;

public class Bank {
    private  ServiceBank service;

    public void setService(ServiceBank service) {
        this.service = service;
    }

    public Bank(){
        service = new ServiceBank();
    }

    public String getMaximoPrestamo(String ci){
        String value = service.getCategoria(ci);
        switch (value){
            case "A":
                return "CI:" + ci + " maximo a prestar 200000";
            case "B":
                return "CI:" + ci + " maximo a prestar 100000";
            case "C":
                return "no se puede prestar ningún monto ALERTA!";
            default:
                return value;
        }
    }

}
