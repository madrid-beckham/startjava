package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            calculator.consider();
            while (true) {
                System.out.print("Хотите продолжить? [да/нет]: ");
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




