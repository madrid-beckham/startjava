package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = sc.nextLine();
            String[] mathExpres = mathExpression.split(" ");
            calculator.setMathOperation(mathExpres[1]);
            int firstNumber = Integer.parseInt(mathExpres[0]);
            calculator.setFirstNumber(firstNumber);
            int secondNumber = Integer.parseInt(mathExpres[2]);
            calculator.setSecondNumber(secondNumber);
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



