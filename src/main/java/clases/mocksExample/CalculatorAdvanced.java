package clases.mocksExample;

public class CalculatorAdvanced {
    private String name = "calculadora X";
    private ServiceCalc calc;
    public CalculatorAdvanced(){
        calc = new ServiceCalc();
    }

    public CalculatorAdvanced(ServiceCalc calc) {
        this.calc = calc;
    }
    public void setCalcService(ServiceCalc calcService) {
        this.calc = calcService;
    }

    public int getFactorial(int number){
        int f = 1;
        for (int i = 1; i<= number; i++){
            f = calc.mult(f, i);
        }
        return f;
    }
}
