package ru.netology;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        return (int) (
                target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result()
        );
    }
    @Override
    public int sub(int arg0, int arg1) {
        //считаем через target
        return (int) (
                target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUB).result()
        );
    }
    @Override
    public int div(int arg0, int arg1) {
        //считаем через target
        return (int) (
                target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.DIV).result()
        );
    }
    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        return (int) (
                target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT).result()
        );

    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        return (int) (
                target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.POW).result()
        );
    }
}
