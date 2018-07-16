import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(sc.next());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(sc.next());
        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        do {
            guessNumber.play();
            while (true) {
                System.out.print("Хотите продолжить? [да/нет]: ");
                choice = sc.next();
                if (choice.equals("да") || choice.equals("нет")) {
                    break;
                }
            }
        }
        while (choice.equals("да"));
    }
}