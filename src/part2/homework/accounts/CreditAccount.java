package part2.homework.accounts;

public class CreditAccount extends Account {

    private long limit;

    public CreditAccount(long limit) {
        this.limit = limit;
    }

    @Override
    public boolean add(long amount) {
        if (balance <= -amount) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount > limit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
