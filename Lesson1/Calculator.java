// Реализовать калькулятор с  математическими операциями(+, -, *, /, ^, %) над целыми положительными числами.
// Сделать вывод выражений и использовать для проверки знаков условие if else
public class Calculator {
	public static void main(String[] args) {
		char sign = '^'; 
		int firstNumber = 3;
		int secondNumber = 3;

		if (sign == '+') {
			System.out.println(firstNumber + secondNumber);
		} else if (sign == '-') {
			System.out.println(firstNumber - secondNumber);
		} else if (sign == '*') {
			System.out.println(firstNumber * secondNumber);
		} else if (sign == '/') {
			System.out.println(firstNumber / secondNumber);
		} else if (sign == '^') {
			int count = 1;
			for (int i = 0; i < secondNumber; i++) {
				count *= firstNumber;
			}
			System.out.println(count);
		} else if (sign == '%') {
			System.out.println(firstNumber % secondNumber);
		}
	}
}