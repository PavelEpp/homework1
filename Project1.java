import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your number:   ");
        int number = scanner.nextInt();

        int res = 0;
        int res2 = 1;
        for (int i = 0; i <= number; i++) {
            res += i;
        }
        for (int i = 1; i <= number; i++) {
            res2 = res2 * i;
        }
        System.out.printf("Summ from 1 to n = ");
        System.out.println(res);
        System.out.printf("factorial n = ");
        System.out.println(res2);
    }
}