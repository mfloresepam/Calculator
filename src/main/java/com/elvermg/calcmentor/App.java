package com.elvermg.calcmentor;

import com.elvermg.calcmentor.services.Calculator;

import java.math.BigInteger;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("This is a calculator APP.");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please insert your first operand");

        BigInteger firstOperand = scanner.nextBigInteger();

        System.out.println("Please insert the operation symbol: (* / + -)");

        String operation = scanner.next();

        System.out.println("Please insert your second operand");

        BigInteger secondOperand = scanner.nextBigInteger();

        System.out.println("Result is: " + calculator.performOperation(firstOperand, operation, secondOperand));
    }
}
