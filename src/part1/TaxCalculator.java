//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import static part1.ru.netology.service.CustomService.calculateTax;

void main() {
    // калькулятор для расчёта пошлины
    Scanner sc = new Scanner(System.in);

    System.out.println("Здравствуйте. Введите введите стоимость в рублях и вес товара в кг");

    int price = sc.nextInt();
    int kg = sc.nextInt();

    int tax = calculateTax(price, kg);

    System.out.println(tax);

}


