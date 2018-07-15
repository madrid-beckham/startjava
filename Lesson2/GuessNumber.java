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
        thoughtNumber = (int) (Math.random() * 100);
        System.out.println("Подсказка, число загаданное компьютером равно " + thoughtNumber);
        while (true) {
            System.out.print(" Ввод числа " + playerOne.getName());
            inputOfNumber(playerOne);
            System.out.print(" Ввод числа " + playerTwo.getName());
            inputOfNumber(playerTwo);
            check(playerOne);
            check(playerTwo);
            break;
        }
    }

    public void check(Player player) {
        if (player.getNumber() == thoughtNumber) {
            System.out.println(player.getName() + " вы угадали!");
        } else if ((player.getNumber() > thoughtNumber)) {
            System.out.println(player.getName() + " вы ввели число больше, чем которое загадал компьютер");
        } else if ((player.getNumber() < thoughtNumber)) {
            System.out.println(player.getName() + " вы ввели число меньше, чем которое загадал компьютер");
        }
    }

    public void inputOfNumber(Player player) {
        player.number = sc.nextInt();
    }
}
