package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String answer;
        do {
            init(calculator);
            calculator.consider();
            answer = testUserAnswer();
        } while (!answer.equals("нет"));
    }

    public static void init(Calculator calculator) {
        String[] mathExpress = receiveMathExpression();
        calculator.setFirstNumber(Integer.parseInt(mathExpress[0]));
        calculator.setMathOperation(mathExpress[1]);
        calculator.setSecondNumber(Integer.parseInt(mathExpress[2]));
    }

    public static String[] receiveMathExpression() {
        System.out.print("Введите математическое выражение: ");
        return sc.nextLine().split(" ");
    }

    public static String getUserAnswer() {
        System.out.print("Хотите продолжить? [да/нет]: ");
        return sc.nextLine();
    }

    public static String testUserAnswer() {
        String userAnswer;
        do {
            userAnswer = getUserAnswer();
        } while (!(userAnswer.equals("нет") || userAnswer.equals("да")));
        return userAnswer;
    }
}
