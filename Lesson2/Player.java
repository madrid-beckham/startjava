import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputOfNumber() {
        number(sc.nextInt());
    }
}