package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner sc = new Scanner(System.in);
    private static Calculator calculator = new Calculator();
    private static String userAnswer;

    public static void main(String[] args) {
        do {
            init();
            calculator.consider();
            System.out.print("Хотите продолжить? [да/нет]: ");
            proceed();
        } while (!userAnswer.equals("нет"));
    }

    public static String inputExample() {
        System.out.print("Введите математическое выражение: ");
       return sc.nextLine();
    }

    public static void init() {
        String[] mathExpress = inputExample().split(" ");
        int firstNumber = Integer.parseInt(mathExpress[0]);
        calculator.setFirstNumber(firstNumber);
        calculator.setMathOperation(mathExpress[1]);
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



