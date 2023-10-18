package com.elvermg.calcmentor;

import com.elvermg.calcmentor.services.Calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your first operand");

        String firstOperand = scanner.next();

        System.out.println("Please insert the operation symbol: (* / + -)");

        String operation = scanner.next();

        System.out.println("Please insert your second operand");

        String secondOperand = scanner.next();

        System.out.println("Result is: " + calculator.performOperation(firstOperand, operation, secondOperand));
    }
}
