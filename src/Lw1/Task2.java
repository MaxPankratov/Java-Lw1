package Lw1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int inputDay;
        int inputMonth;

        Scanner scanner = new Scanner(System.in);

        System.out.print("День: ");
        inputDay = scanner.nextInt();
        while (inputDay < 1 || inputDay > 31) {
            System.out.print("Неверное число!\nДень: ");
            inputDay = scanner.nextInt();
        }

        System.out.print("Месяц: ");
        inputMonth = scanner.nextInt();
        while (inputMonth < 1 || inputMonth > 12) {
            System.out.print("Такого месяца нет!\nМесяц: ");
            inputMonth = scanner.nextInt();
        }
        String resultSeason;
        switch (inputMonth) {
            case 1, 12:
                resultSeason = "Зима";
                break;
            case 2:
                resultSeason = "Зима";
                if (inputDay >= 30) System.out.print("Такого числа нет в этом месяце, но это ");
                break;
            case 4:
                resultSeason = "Весна";
                break;
            case 3, 5:
                resultSeason = "Весна";
                if (inputDay == 31) System.out.print("Такого числа нет в этом месяце, но это ");
                break;
            case 6:
                resultSeason = "Лето";
                if (inputDay == 31) System.out.print("Такого числа нет в этом месяце, но это ");
                break;
            case 7, 8:
                resultSeason = "Лето";
                break;
            case 9, 11:
                resultSeason = "Осень";
                if (inputDay == 31) System.out.print("Такого числа нет в этом месяце, но это ");
                break;
            case 10:
                resultSeason = "Осень";
                break;
            default:
                resultSeason = "Не представляю, что вы могли ввести, бред полный";
        }
        System.out.println(resultSeason);
    }
}
