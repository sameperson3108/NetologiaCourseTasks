package part1.ru.netology.service;

public class CustomService {

    public static int calculateTax(int price, int kg) {
        return price / 100 + kg * 100;
    }
}
