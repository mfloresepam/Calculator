package com.elvermg.calcmentor;

import com.elvermg.calcmentor.services.Calculator;

import java.math.BigInteger;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your first operand");

        BigInteger firstOperand = scanner.nextBigInteger();

        System.out.println("The number inserted for first operand is: " + firstOperand);

        System.out.println("Please insert the operation symbol: (* / + -)");

        String operation = scanner.next();

        System.out.println("The operation to perform is " + operation);

        System.out.println("Please insert your second operand");

        BigInteger secondOperand = scanner.nextBigInteger();

        System.out.println("The number inserted for second operand is: " + firstOperand);

        System.out.println("Result is: " + calculator.performOperation(firstOperand, operation, secondOperand));
    }
}
