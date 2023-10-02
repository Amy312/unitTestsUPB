package ejercicios.ejercicio2;

public class Number {

    public String getReverse(int number){
        if(number >= 0 && number <= 2147483647){
            String newNumber = Integer.toString(number);
            StringBuilder answer = new StringBuilder();
            answer.append(newNumber);
            answer.reverse();
            return answer.toString();
        } else {
            return "Valor Incorrecto";
        }
    }
}
