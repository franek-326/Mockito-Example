
class Calculator {
    final private CalculatorService calculatorService;

    Calculator(CalculatorService cs) {
        this.calculatorService = cs;
    }


    int performAdd(int i, int j) {
        return calculatorService.add(i, j);
    }
}
