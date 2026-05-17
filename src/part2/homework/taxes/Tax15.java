package part2.homework.taxes;

public class Tax15 extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (debit - credit) * 15 / 100;
        return Math.max(tax, 0);
    }
}
