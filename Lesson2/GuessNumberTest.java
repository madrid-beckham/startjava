import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        String input;

        do {
            guessNumber.game();
            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                input = sc.next();
                if (input.equals("да") || input.equals("нет")) {
                    break;
                }
            }
        }
        while (input.equals("да"));
    }
}