package e1;

public class CanWithdrawBankAccount extends DecoratorBankAccount {

    public CanWithdrawBankAccount(BankAccount base) {
        super(base);
    }

    @Override
    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount);
    }
}
