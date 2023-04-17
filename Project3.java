import java.util.Scanner;

// Реализовать простой калькулятор

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your number1: ");
        int number1 = scanner.nextInt();
        System.out.printf("Enter your number2: ");
        int number2 = scanner.nextInt();
        System.out.printf("Enter your operation: ");
        String operation = scanner.next();

        System.out.println(calculator(number1, number2, operation));
    }

    public static int calculator(int a, int b, String operation) {
        int res;
        switch (operation) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            default:
                res = -1;
                System.out.println("Not found 404");
        }
        return res;
    }
}
