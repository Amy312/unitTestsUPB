package ejercicios.ejercicio5;

import java.util.regex.Pattern;

public class ServiceBank {

    public String getCategoria(String ci){
        String regex = "^[0-9]{5,8}(?:-[a-zA-Z])?$";
        boolean matches = Pattern.matches(regex, ci);
        if (!matches) {
            return "CI inválido";
        }
        int categoria = (int) Math.random() * 2;

        switch (categoria){
            case 0:
                return "A";
            case 1:
                return "B";
            default:
                return "C";
        }
    }
}