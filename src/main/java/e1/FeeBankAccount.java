package e1;

public class FeeBankAccount extends DecoratorBankAccount {

    public int feeWithdraw;

    public FeeBankAccount(BankAccount base, int fee) {
        super(base);
        this.feeWithdraw = fee;
    }

    @Override
    public void withdraw(int amount) {
        base.withdraw(amount + feeWithdraw);
    }
}
