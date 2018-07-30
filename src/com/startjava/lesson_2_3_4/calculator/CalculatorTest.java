package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner sc = new Scanner(System.in);
    static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите математическое выражение: ");
            calculator.setMathExpression(sc.nextLine());
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
}



