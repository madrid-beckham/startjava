import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String continue;
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(sc.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(sc.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(sc.nextInt());
            calculator.consider();

            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                continue = sc.next();
                if ("нет".equals(continue)) {
                    break;
                } else if ("да".equals(continue)) {
                    break;
                }
            }
        }
        while (!"нет".equals(continue));
    }
}




