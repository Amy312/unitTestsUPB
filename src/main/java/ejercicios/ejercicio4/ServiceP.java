package ejercicios.ejercicio4;

public class ServiceP {

    public boolean isPalindrome(String word){
        StringBuilder reversed = new StringBuilder(word);

        reversed = reversed.reverse();

        return word.equals(reversed.toString());
    }
}
