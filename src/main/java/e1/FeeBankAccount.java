package e1;

public class FeeBankAccount extends DecoratorBankAccount {

    public int feeWithdraw;
    public int minimumWithdraw;

    public FeeBankAccount(BankAccount base, int fee, int minimumWithdraw) {
        super(base);
        this.feeWithdraw = fee;
        this.minimumWithdraw = minimumWithdraw;
    }

    @Override
    public void withdraw(int amount) {
        if(amount >= minimumWithdraw) {
            base.withdraw(amount + feeWithdraw);
        } else {
            base.withdraw(amount);
        }
    }
}
