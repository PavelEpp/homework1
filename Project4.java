// /*
//  4. *+Задано уравнение вида q + w = e, q, w, e >= 0. 
//  Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69. 
//  Требуется восстановить выражение до верного равенства. 
//  Предложить хотя бы одно решение или сообщить, что его нет.
//  /



import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        char a = 63;
        char b = 63;
        char c = 63;
        char d = 63;
        char e = 63;
        char f = 63;


        for (int i = 0; i < 10; i++) {
            if (a == 63) {
                a = (char) i;
            }
            for (int j = 0; j < 10; j++) {
                if (b == 63) {
                    b = (char) j;
                }
                for (int l = 0; l < 10; l++) {
                    if (c == 63) {
                        c = (char) l;
                    }
                    for (int k = 0; k < 10; k++) {
                        if (d == 63) {
                            d = (char) k;
                        }
                        for (int n = 0; n < 10; n++) {
                            if (e == 63) {
                                e = (char) n;
                            }
                            for (int m = 0; m < 10; m++) {
                                if (f == 63) {
                                    f = (char) m;
                                }
                                if (a * 10 + b + c * 10 + d == e * 10 + f) {
                                    System.out.printf("%c%c + %c%c = %c%c\n", a , b, c, d, e, f);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}