// Вывести все простые числа от 1 до 1000

public class Project2 {
    public static void main(String[] args) {
        int number = 1000;
        for (int i = 2; i < number; i++) {
            boolean flag = true;
            for (int j = 2; j < i && flag; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
