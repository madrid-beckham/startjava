public class Calculator {
    private int firstNumber;
    private char sign;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;

    }


    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public char getSign() {
        return sign;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void calc() {

        switch (getSign()) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(getFirstNumber() - getSecondNumber());
                break;
            case '*':
                System.out.println(getFirstNumber() * getSecondNumber());
                break;
            case '/':
                System.out.println(getFirstNumber() / getSecondNumber());
                break;
            case '^':
                int count = 1;
                for (int i = 0; i < getSecondNumber(); i++) {
                    count *= getFirstNumber();
                }
                System.out.println(count);
                break;
            case '%':
                System.out.println(getFirstNumber() % getSecondNumber());
                break;
        }

    }

}



