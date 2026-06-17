import java.util.Scanner;

public class Calculator {

    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number:");
            double numberOne = scanner.nextDouble();

            System.out.println("Enter operator (+, -, *, /, inv, sqrt, sq):");
            String operator = scanner.next();

            double numberTwo = 0;
            if (!(operator.equals("inv") || operator.equals("sqrt"))) {
                System.out.println("Enter the second number:");
                numberTwo = scanner.nextDouble();
            }

            double result = 0;

            switch (operator) {
                case "+":
                    result = numberOne + numberTwo;
                    break;
                case "-":
                    result = numberOne - numberTwo;
                    break;
                case "*":
                    result = numberOne * numberTwo;
                    break;
                case "/":
                    result = numberOne / numberTwo;
                    break;
                case "inv":
                    result = 1 / numberOne;
                    break;
                case "sqrt":
                    result = Math.sqrt(numberOne);
                    break;
                case "sq":
                    result = numberOne * numberOne;
                    break;
                default:
                    System.out.println("Unknown operator");
            }

            System.out.println("Result is: " + result);

            System.out.println("Do you want to continue? (y/n)");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate();
    }
}
