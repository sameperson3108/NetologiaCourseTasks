package part2.abstraction;

public class Main {
    static void main() {

        String name = "Petya";

        Car car = new Car();
        spbToMoscow(name, car);

        Ship ship = new Ship();
        spbToMoscow(name, ship);

        Bicycle bicycle = new Bicycle();
        spbToMoscow(name, bicycle);
    }

    public static void spbToMoscow(String name, Transferer transferer) {
        transferer.transfer(name, "SPB", "Moscow");
    }
}
