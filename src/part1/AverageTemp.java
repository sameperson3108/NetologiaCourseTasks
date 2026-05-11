package part1;

import java.util.Scanner;

public class AverageTemp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] temps = new int[30];
        boolean[] isFilled = new boolean[30];
        while (true) {
            System.out.println("Введи два числа: дата температура");
            String input = sc.nextLine();
            if (input.equals("end")) break;

            String[] parts = input.split(" ");
            int day = Integer.parseInt(parts[0]) - 1;
            int temp = Integer.parseInt(parts[1]);
            temps[day] = temp;
            isFilled[day] = true;

            double sum = 0;
            for (int tempsPerDay : temps) {
                sum += tempsPerDay;
            }
            int cnt = 0;
            for (boolean f : isFilled) {
                if (f) cnt++;
            }
            System.out.println("Средняя температура " + (sum / cnt));
        }
    }
}
