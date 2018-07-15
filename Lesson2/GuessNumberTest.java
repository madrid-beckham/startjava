import java.util.Scanner;

public class GuessNumberTest {
    private static String choice;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Имя первого игрока");
        Player playerOne = new Player(userName());
        System.out.println("Имя второго игрока");
        Player playerTwo = new Player(userName());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        do {
            guessNumber.game();
            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                choice = sc.next();
                if (choice.equals("да") || choice.equals("нет")) {
                    break;
                }
            }
        }
        while (choice.equals("да"));
    }

    public static String userName() {
        return sc.next();
    }
}