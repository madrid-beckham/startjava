package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static java.lang.Math.*;


public class Calculator {
    private Scanner sc = new Scanner(System.in);
    private int firstNumber;
    private String[] transfer;
    private int secondNumber;
    private String expression;
    private String sign;

    public void consider() {
        enteringExpressions();
        switch (sign) {
            case "+":
                System.out.println(addExact(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(subtractExact(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(multiplyExact(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println(floorDiv(firstNumber, secondNumber));
                break;
            case "^":
                System.out.println(Math.pow(firstNumber, secondNumber));
                break;
            case "%":
                System.out.println(floorMod(firstNumber, secondNumber));
                break;
        }
    }

    public void enteringExpressions() {
        System.out.print("Введите выражение через пробел ");
        expression = sc.nextLine();
        transfer = expression.split(" ");
        firstNumber = Integer.parseInt(transfer[0]);
        sign = transfer[1];
        secondNumber = Integer.parseInt(transfer[2]);
    }
}



