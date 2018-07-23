package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Mark-3", "Gipsy Danger (Jaeger)", "Destroyed", 79.2,
                1.80, 8, 6);
        System.out.println(jaegerOne.getMark());
        System.out.println("Минимальный уровень атаки  " + jaegerOne.attack(jaegerOne.getArmor(), jaegerOne.getStrenght()));

        Jaeger jaegerTwo = new Jaeger("Mark-6", "StrikerEureka", "Destroyed", 76.2,
                1.850, 10, 9);
        System.out.println("Модель " + jaegerTwo.getModelName());
        System.out.println("Минимальный уровень атаки  " + jaegerTwo.attack(jaegerTwo.getArmor(), jaegerTwo.getStrenght()));
    }
}
