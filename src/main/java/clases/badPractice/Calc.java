package clases.badPractice;

public class Calc {
    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[]args){
        Calc calc = new Calc();
        if(calc.add(5, 5) == 10){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
