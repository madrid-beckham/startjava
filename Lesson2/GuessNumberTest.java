public class GuessNumber {
    Player playerOne = new Player();
    Player playerTwo = new Player();
    private int thoughtNumber;

    public void game() {
        thoughtNumber = (int) (Math.random() * 100);
        System.out.println("Подсказка число загаданное компьютером " + thoughtNumber);
        while (true) {
            System.out.println("Ввод числа " + playerOne.getName());
            playerOne.inputOfNumber();
            System.out.println("Ввод числа " + playerTwo.getName());
            playerTwo.inputOfNumber();
            if (playerOne.getNumber() == thoughtNumber && playerTwo.getNumber() != thoughtNumber) {
                System.out.println(playerOne.getName() + " Игрок 1 вы угадали!");
                break;
            } else if (playerTwo.getNumber() == thoughtNumber && playerOne.getNumber() != thoughtNumber) {
                System.out.println(playerTwo.getName() + " Игрок 2 вы угадали!");
                break;
            } else if (playerOne.getNumber() == thoughtNumber && playerTwo.getNumber() == thoughtNumber) {
                System.out.println(playerOne.getName() + " Игрок 1 вы угадали!");
                System.out.println(playerTwo.getName() + " Игрок 2 вы угадали!");
                break;
            } else if ((playerOne.getNumber() > thoughtNumber) && (playerTwo.getNumber() > thoughtNumber)) {
                System.out.println(playerOne.getName() + " вы ввели число больше, чем которое загадал компьютер");
                System.out.println(playerTwo.getName() + " вы ввели число больше, чем которое загадал компьютер");
            } else if ((playerOne.getNumber() < thoughtNumber) && (playerTwo.getNumber() < thoughtNumber)) {
                System.out.println(playerOne.getName() + " вы ввели число меньше, чем которое загадал компьютер");
                System.out.println(playerTwo.getName() + " вы ввели число меньше, чем которое загадал компьютер");
            } else if ((playerTwo.getNumber() > thoughtNumber) && (playerOne.getNumber() < thoughtNumber)) {
                System.out.println(playerOne.getName() + " вы ввели число меньше, чем которое загадал компьютер");
                System.out.println(playerTwo.getName() + " вы ввели число больше, чем которое загадал компьютер");
            } else if ((playerTwo.getNumber() < thoughtNumber) && (playerOne.getNumber() > thoughtNumber)) {
                System.out.println(playerOne.getName() + " вы ввели число больше, чем которое загадал компьютер");
                System.out.println(playerTwo.getName() + " вы ввели число меньше, чем которое загадал компьютер");
            }
        }
    }
}