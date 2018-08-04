package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner sc = new Scanner(System.in);
    private static Calculator calculator = new Calculator();

    public static void main(String[] args) {

        while (true) {
            exampleInput();
            calculator.consider();
            System.out.print("Хотите продолжить? [да/нет]: ");
            String choice = sc.nextLine();
            while (!(choice.equals("нет") || choice.equals("да"))) {
                System.out.print("Вы ввели некорректный ответ. Поробуйте ещё раз [да/нет]: ");
                choice = sc.nextLine();
            }
            if (choice.equals("нет")) {
                break;
            }
        }
    }

    public static void exampleInput() {
        System.out.print("Введите математическое выражение: ");
        String mathExpression = sc.nextLine();
        String[] mathExpress = mathExpression.split(" ");
        calculator.setMathOperation(mathExpress[1]);
        int firstNumber = Integer.parseInt(mathExpress[0]);
        calculator.setFirstNumber(firstNumber);
        int secondNumber = Integer.parseInt(mathExpress[2]);
        calculator.setSecondNumber(secondNumber);
    }
}



