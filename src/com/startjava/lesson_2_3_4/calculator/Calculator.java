package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;


public class Calculator {
    private int firstNumber;
    private String mathOperation;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void consider() {

        switch (mathOperation) {
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
}



