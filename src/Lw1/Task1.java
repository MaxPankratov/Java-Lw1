package Lw1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentDay = 25;
        int currentMonth = 11;
        int currentYear = 2022;

        int inputYear;
        System.out.print("Год рождения: ");
        inputYear = scanner.nextInt();
        while (inputYear > 2022) {
            System.out.print("Такой год ещё не наступил!\nВведите год рождения: ");
            inputYear = scanner.nextInt();
        }

        int inputMonth;
        System.out.print("Месяц рождения: ");
        inputMonth = scanner.nextInt();
        while ((inputMonth < 1 || inputMonth > 12) || (inputMonth > currentMonth && inputYear == currentYear)) {
            System.out.print("Такого месяца нет (или он ещё не наступил)!\nМесяц: ");
            inputMonth = scanner.nextInt();
        }

        int inputDay;
        System.out.print("Введите день рождения: ");
        inputDay = scanner.nextInt();
        while ((inputDay < 1 || inputDay > 31 )  ||  (inputMonth == currentMonth && inputDay > currentDay)  || (inputDay == 31 && ((inputMonth == 2) || (inputMonth == 4) ||(inputMonth == 6) ||(inputMonth == 9) ||(inputMonth == 11)))  ||  (inputDay == 30 && inputMonth == 2)) {
            System.out.print("Такого числа нет в этом месяце (или этот день ещё не наступил)!\nВведите день рождения: ");
            inputDay = scanner.nextInt();
        }



        int resultYear;
        int resultMonth;
        int resultDay;

        resultYear = currentYear - inputYear;

        if (inputMonth > currentMonth) {
            resultYear -= 1;
            resultMonth = currentMonth + 12 - inputMonth;
        } else resultMonth = currentMonth - inputMonth;

        if (inputDay > currentDay) {
            resultMonth -= 1;
            switch (inputMonth) {
                case 2:
                    resultDay = currentDay + 29 - inputDay;
                    break;
                case 4,6,9,11:
                    resultDay = currentDay + 30 - inputDay;
                    break;
                default:
                    resultDay = currentDay + 31 - inputDay;
            }
        } else resultDay = currentDay - inputDay;


        System.out.println(resultYear + "лет, " + resultMonth + " месяцев и " + resultDay + "дней");
    }
}