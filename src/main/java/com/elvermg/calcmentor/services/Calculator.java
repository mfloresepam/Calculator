package com.elvermg.calcmentor.services;

public class Calculator {
    public int performOperation(String firstOperand, String operation, String secondOperand) {
        int first = Integer.parseInt(firstOperand);
        int second = Integer.parseInt(secondOperand);
        switch (operation) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "/":
                return first / second;
            case "*":
                return first * second;
            default:
                return 0;
        }
    }
}
