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

        if (player.getNumber() == thoughtNumber) {
            System.out.println(player.getName() + ", вы угадали!");
            return thoughtNumber;
        } else if ((player.getNumber() > thoughtNumber)) {
            System.out.println(player.getName() + ", вы ввели число больше, чем которое загадал компьютер");
            return player.getNumber();
        } else if ((player.getNumber() < thoughtNumber)) {
            System.out.println(player.getName() + ", вы ввели число меньше, чем которое загадал компьютер");
            return player.getNumber();
        }
        return player.getNumber();
    }

    public void inputOfNumber(Player player) {
        System.out.print(" Ввод числа: " + player.getName());
        player.setNumber(sc.nextInt());
    }
}
