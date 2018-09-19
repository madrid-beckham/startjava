package com.startjava.lesson_2_3_4.game;


import java.util.Scanner;

public class GuessNumberTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Player[] players = getPlayer();
        GuessNumber guessNumber = new GuessNumber(players[0], players[1]);
        while (true) {
            guessNumber.play();
            testEnd();
        }
    }

    public static Player[] getPlayer() {
        System.out.print("Введите ваши имена через пробел[имя_игрока_1 <ПРОБЕЛ> имя_игрока_2]: ");
        return new Player[]{new Player(sc.next()),new Player(sc.next())};
    }

    public static void testEnd() {
        while (true) {
            System.out.print("Хотите продолжить?[да/нет]: ");
            String userAnswer = sc.next();
            if ("да".equals(userAnswer))break;
            if ("нет".equals(userAnswer))System.exit(0);
        }
    }
}