package Lw1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("n: ");
        int n = scanner.nextInt();
        while (n <= -15 || n >= 15) {
            System.out.print("Значение вне диапазона\nn: ");
            n = scanner.nextInt();
        }

        double result = 1;

        if (x == 0 && n < 0) {
            result = 0; //Infinity
        } else {
            if (n >= 0) {
                for (int i = 1; i <= n; i++) {
                    result = result * x;
                }
            } else {
                for (int i = 1; i <= -n; i++) {
                    result /= x;
                }
            }
        }
        System.out.print("Результат: " + result);
    }
}
