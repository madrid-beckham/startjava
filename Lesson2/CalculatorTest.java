import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        String x;
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(sc.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(sc.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(sc.nextInt());
            calculator.calc();

            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                x = sc.next();
                if ("нет".equals(x)) {
                    break;
                } else if ("да".equals(x)) {
                    break;
                }
            }
        }

        while (!"нет".equals(x));


    }

}




