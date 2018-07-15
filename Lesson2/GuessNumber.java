public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int thoughtNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        thoughtNumber = (int) (Math.random() * 100);
        System.out.println("Подсказка, число загаданное компьютером равно " + thoughtNumber);
        while (true) {
            System.out.print(" Ввод числа " + playerOne.getName());
            playerOne.inputOfNumber();
            System.out.print(" Ввод числа " + playerTwo.getName());
            playerTwo.inputOfNumber();
            if (check(playerOne) == thoughtNumber) {
                break;
            } else if (check(playerTwo) == thoughtNumber) {
                break;
            }
        }
    }

    public int check(Player player) {
        if (player.getNumber() == thoughtNumber) {
            System.out.println(player.getName() + " вы угадали!");
            return thoughtNumber;
        } else if ((player.getNumber() > thoughtNumber)) {
            System.out.println(player.getName() + " вы ввели число больше, чем которое загадал компьютер");
        } else if ((player.getNumber() < thoughtNumber)) {
            System.out.println(player.getName() + " вы ввели число меньше, чем которое загадал компьютер");
        }
        return 0;
    }
}
