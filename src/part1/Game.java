package part1;

import java.util.Scanner;

public class Game {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Введите год");
            int year = sc.nextInt();
            System.out.println("Введите количество дней");
            int days = sc.nextInt();

            int realDays = calcDays(year);

            if (days == realDays) count++;
            else {
                System.out.printf("Неправильно! В этом году %d дней!\n", realDays);
                System.out.printf("Набрано очков: %d\n", count);
                break;
            }
        }

    }

    private static int calcDays(int year) {
        if (year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0)) return 366;
        else { return 365;}
    }
}
