import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        String choice;
        System.out.println("Имя первого игрока");
        String oneName = sc.next();
        guessNumber.playerOne.setName(oneName);
        System.out.println("Имя второго игрока");
        String twoName = sc.next();
        guessNumber.playerTwo.setName(twoName);
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