package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static String mathExpression;
    private static Scanner sc = new Scanner(System.in);
    private static Calculator calculator = new Calculator();
    private static String userAnswer;

    public static void main(String[] args) {

        while (true) {
            input();
            initialization();
            calculator.consider();
            System.out.print("Хотите продолжить? [да/нет]: ");
            proceed();
            if (userAnswer.equals("нет")) {
                break;
            }
        }
    }

    public static void input() {
        System.out.print("Введите математическое выражение: ");
        mathExpression = sc.nextLine();
    }

    public static void initialization() {
        String[] mathExpress = mathExpression.split(" ");
        calculator.setMathOperation(mathExpress[1]);
        int firstNumber = Integer.parseInt(mathExpress[0]);
        calculator.setFirstNumber(firstNumber);
        int secondNumber = Integer.parseInt(mathExpress[2]);
        calculator.setSecondNumber(secondNumber);
    }

    public static void proceed() {
        userAnswer = sc.nextLine();
        while (!(userAnswer.equals("нет") || userAnswer.equals("да"))) {
            System.out.print("Вы ввели некорректный ответ. Поробуйте ещё раз [да/нет]: ");
            userAnswer = sc.nextLine();
        }
    }
}



