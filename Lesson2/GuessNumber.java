import java.util.Scanner;

public class GuessNumber {
    Scanner sc = new Scanner(System.in);

    public void game() {
        Player playerOne = new Player();
        System.out.println("Имя первого игрока");
        String oneName = sc.next();
        playerOne.setName(oneName);

        Player playerTwo = new Player();
        System.out.println("Имя второго игрока");
        String twoName = sc.next();
        playerTwo.setName(twoName);

        int thoughtNumber = (int) (Math.random() * 3);
        System.out.println(thoughtNumber);

        while (true) {
            System.out.println("Ввод числа первым игроком");
            playerOne.inputOfNumber();
            System.out.println("Ввод числа вторым игроком");
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