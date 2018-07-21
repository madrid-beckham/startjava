package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int firstNumber;
    private char sign;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void consider() {
        switch (sign) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '^':
                exponentiation();
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
        }
    }
    
    public void exponentiation() {
        int count = 1;
        for (int i = 0; i < secondNumber; i++) {
            count *= firstNumber;
        }
        System.out.println(count);
    }
}



