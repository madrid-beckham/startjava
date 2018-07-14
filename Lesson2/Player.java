import java.util.Scanner;

public class Player {
    private Scanner sc = new Scanner(System.in);
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void inputOfNumber() {
        number = sc.nextInt();
    }
}