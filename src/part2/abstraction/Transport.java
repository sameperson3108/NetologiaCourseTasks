package part2.abstraction;

public abstract class Transport implements Transferer {
    private int fuel;

    public Transport(int fuel) {
        this.fuel = fuel;
    }

    public void spendFuel(int fuel) {
        this.fuel -= fuel;
    }
}
