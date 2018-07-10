import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    private String player;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void inputOfNumber() {
        setNumber(sc.nextInt());
    }
}