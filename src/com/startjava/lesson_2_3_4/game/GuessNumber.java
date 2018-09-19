package com.startjava.lesson_2_3_4.game;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int thoughtNumber;
    private Scanner sc = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        int attemps = 0;
        int[] mas1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] mas2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        thoughtNumber = (int) (Math.random() * 100);
        System.out.println("Подсказка, число загаданное компьютером равно " + thoughtNumber);
        while (attemps < 10) {
            inputOfNumber(playerOne);
            inputOfNumber(playerTwo);
            mas1[attemps] = playerOne.getNumber();
            mas2[attemps] = playerTwo.getNumber();
            playerOne.setSaveNumbers(mas1);
            playerTwo.setSaveNumbers(mas2);
            int numberPlayerOne = check(playerOne, attemps);
            int numberPlayertwo = check(playerTwo, attemps);
            if (attemps == 9) {
                System.out.print("Вы проиграли:(\n Ваши попытки: \n" + playerOne.getName() + ": " + Arrays.toString(playerOne.getSaveNumbers()) + "\n" + playerTwo.getName() + ": " + Arrays.toString(playerTwo.getSaveNumbers())
                        + "\n----------------\nХотите продожить?[да/нет]");
                attemps = 0;
            }
            attemps++;
            if (numberPlayerOne == thoughtNumber && numberPlayertwo == thoughtNumber) {
                break;
            } else if (numberPlayerOne == thoughtNumber || numberPlayertwo == thoughtNumber) {
                break;
            }
        }
    }

    public void inputOfNumber(Player player) {
        System.out.print(player.getName() + " вводит число: ");
        player.setNumber(sc.nextInt());
    }

    public int check(Player player, int attemps) {
        int number = player.getNumber();
        String name = player.getName();
        if (number == thoughtNumber) {
            System.out.println(name + ", вы угадали! Ваши попытки:");
            System.out.println(Arrays.toString(Arrays.copyOf(player.getSaveNumbers(), attemps + 1)));
        } else if (number > thoughtNumber) {
            System.out.println(name + ", вы ввели число больше, чем которое загадал компьютер");
        } else if (number < thoughtNumber) {
            System.out.println(name + ", вы ввели число меньше, чем которое загадал компьютер");
        }
        return number;
    }
}