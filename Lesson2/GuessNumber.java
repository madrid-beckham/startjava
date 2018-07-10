import java.util.Scanner;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    Player playerOne = new Player();
    Player playerTwo = new Player();

    public void game() {
        int thoughtNumber = (int) (Math.random() * 3);
        System.out.println(thoughtNumber);

        while (true) {
            System.out.println("Ввод числа " + playerOne.getName());
            playerOne.inputOfNumber();
            System.out.println("Ввод числа " + playerTwo.getName());
            playerTwo.inputOfNumber();

            if (playerOne.getNumber() == thoughtNumber && playerTwo.getNumber() != thoughtNumber) {
                System.out.println(playerOne.getName() + " Игрок 1 вы угадали!");
                break;
            } else if (playerTwo.getNumber() == thoughtNumber && playerOne.getNumber() != thoughtNumber) {
                System.out.println(playerTwo.getName() + " Игрок 2 вы угадали!");
                break;
            } else if (playerOne.getNumber() == thoughtNumber && playerTwo.getNumber() == thoughtNumber) {
                System.out.println(playerOne.getName() + " Игрок 1 вы угадали!");
                System.out.println(playerTwo.getName() + " Игрок 2 вы угадали!");
                break;
            }
        }
    }
}