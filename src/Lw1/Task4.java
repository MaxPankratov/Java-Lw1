package Lw1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int outsidePoints = 0;
        System.out.print("Количество точек: ");
        int numberOfPoints = scanner.nextInt();
        System.out.print("Радиус окружности: ");
        double radius = scanner.nextDouble();

        for (int i = 1; i <= numberOfPoints; i++) {

            System.out.print("X " + i + " точки: ");
            double x = scanner.nextDouble();

            System.out.print("Y " + i + " точки: ");
            double y = scanner.nextDouble();

            if (x*x + y*y <= radius*radius) {
                outsidePoints++;
            }
        }

        System.out.println(outsidePoints + "точек попали в окружность");
    }
}