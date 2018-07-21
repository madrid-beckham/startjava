package com.startjava.lesson_1.game;

//Компьютер загадывает целое число от 0 до 100, которое необходимо угадать
// после каждой неудачной попытки вывести подсказку System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
// если число угадано — System.out.println("Вы угадали!")
// игра продолжается до тех пор, пока число не будет угадано (while)
public class MyFirstGame {
	public static void main(String[] args) {
		int numberOfComputer = 7;
		int playerNumber = 10;

		while (true) {
			if (playerNumber < numberOfComputer) {
				 System.out.println("Введенное вами число меньше того, что загадал компьютер");
				 playerNumber++;
			} else if (playerNumber > numberOfComputer) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				playerNumber--;
			} else if (playerNumber == numberOfComputer) {
				System.out.println("Вы угадали!");
				break;
			}
		}
	}
}