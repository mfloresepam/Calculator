package com.elvermg.calcmentor.services;

import java.math.BigInteger;

public class Calculator {
    public BigInteger performOperation(BigInteger firstOperand, String operation, BigInteger secondOperand) {

        switch (operation) {
            case "+":
                return firstOperand.add(secondOperand);
            case "-":
                return firstOperand.subtract(secondOperand);
            case "/":
                return firstOperand.divide(secondOperand);
            case "*":
                return firstOperand.multiply(secondOperand);
            default:
                return BigInteger.valueOf(0);
        }
    }
}
