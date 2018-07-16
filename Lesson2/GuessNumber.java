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
            inputOfNumber(playerOne);
            inputOfNumber(playerTwo);
            if (check(playerOne) == thoughtNumber || check(playerTwo) == thoughtNumber) {
                break;
            }
        }
    }

    public int check(Player player) {
        int number = player.getNumber();
        if (number == thoughtNumber) {
            System.out.println(player.getName() + ", вы угадали!");
        } else if (number > thoughtNumber) {
            System.out.println(player.getName() + ", вы ввели число больше, чем которое загадал компьютер");
        } else if (number < thoughtNumber) {
            System.out.println(player.getName() + ", вы ввели число меньше, чем которое загадал компьютер");
        }
        return number;
    }

    public void inputOfNumber(Player player) {
        System.out.print(player.getName() + " вводит число: ");
        player.setNumber(sc.nextInt());
    }
}
