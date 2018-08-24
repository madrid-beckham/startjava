package com.startjava.lesson_2_3_4.game;
//Модифицируйте программу Угадай число, используя для хранения, названных игроками чисел, массивы:
  //      по окончанию игры отобразите, в две строки через пробел, все названные игроками числа
//  //      если массив полностью не заполнен, т.е. пользователь угадал число менее чем за 10 попыток, то выводить весь
//// массив не нужно
  //      в конце игры выведите сообщение "Игрок " + имя + " угадал число " + число + " с " + номер + " попытки"
  //      если игроки не угадали число за 10 попыток, то отобразите сообщение: "У " + имя + " закончились попытки"
//Создайте дополнительное поле в классе Player, которое будет хранить введенные пользователем числа
  //      Для считывания части массива используйте метод класса Arrays.copyOf
   //     Попробуйте улучшить читаемость кода, разделив его на небольшие методы (рефакторинг)
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userAnswer;
        System.out.println("У вас 10 попыток");
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(sc.next());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(sc.next());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        do {
            guessNumber.play();
            while (true) {
                System.out.print("Хотите продолжить? [да/нет]: ");
                userAnswer = sc.next();
                if (userAnswer.equals("да") || userAnswer.equals("нет")) {
                    break;
                }
            }
        }
        while (userAnswer.equals("да"));
    }
}