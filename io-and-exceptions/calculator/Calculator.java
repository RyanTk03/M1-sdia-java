public class Calculator {

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero not possible.");
            return 0;
        }
        return a / b;
    }

    public int convertToNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + text + "' is not a valid number");
            return 0;
        }
    }

    public double calculate(char op, double a, double b) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return divide(a, b);
            default:
                System.out.println("Error: Operation '" + op + "' not supported");
                return 0;
        }
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.calculate('+', 4, 2));
        System.out.println(c.calculate('/', 5, 0));
        c.convertToNumber("abc");
        c.calculate('&', 2, 3);
    }
}

