package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(sc.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(sc.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(sc.nextInt());
            calculator.consider();

            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                choice = sc.next();
                if ("нет".equals(choice)) {
                    break;
                } else if ("да".equals(choice)) {
                    break;
                }
            }
        }
        while (!"нет".equals(choice));
    }
}




