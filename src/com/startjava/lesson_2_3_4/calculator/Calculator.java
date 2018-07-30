package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;


public class Calculator {
    private String[] mathExpression;

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression.split(" ");
    }

    public void consider() {
        int firstNumber = Integer.parseInt(mathExpression[0]);
        int secondNumber = Integer.parseInt(mathExpression[2]);
        switch (mathExpression[1]) {
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



