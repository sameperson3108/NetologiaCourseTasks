package part1;


import java.util.Scanner;

public class ProductKorzina {
    static void main() {

        String[] products = {"Хлеб", "Яблоки", "Молоко", "Гречка"};
        int[] prices = {100, 200, 300, 400};
        int[] counters = new int[products.length];

        showMenu(products, prices);
        doDialogWithCustomer(counters);
        calcAndShowResult(products, prices, counters);

    }

    private static void calcAndShowResult(String[] products, int[] prices, int[] counters) {
        System.out.println("Ваша корзина:");
        int totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (counters[i] > 0) {
                int currentPrice = prices[i] * counters[i];
                totalPrice += currentPrice;
                System.out.printf("%s %d шт %d руб/шт %d руб в сумме\n", products[i],
                        counters[i], prices[i], currentPrice);
            }
        }
        System.out.printf("Итого %d руб", totalPrice);
    }

    private static void doDialogWithCustomer(int[] counters) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите товар и количество или введите 'end'");
            String answer = sc.nextLine();
            if (answer.equals("end")) break;

            String[] separatedAnswer = answer.split(" ");
            int productPosition = Integer.parseInt(separatedAnswer[0]) - 1;
            int productCount = Integer.parseInt(separatedAnswer[1]);

            counters[productPosition] += productCount;
        }
    }

    private static void showMenu(String[] products, int[] prices) {
        System.out.println("Список возможных товаров для покупки");

        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s %d руб/шт\n", i + 1, products[i], prices[i]);
        }

    }
}
