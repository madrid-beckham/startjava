import java.util.Scanner;

public class GuessNumberTest {
    private static String choice;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        System.out.println("Имя первого игрока");
        guessNumber.playerOne.setName(sc.next());
        System.out.println("Имя второго игрока");
        guessNumber.playerTwo.setName(sc.next());
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
}