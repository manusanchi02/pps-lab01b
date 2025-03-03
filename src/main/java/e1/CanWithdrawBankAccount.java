package e1;

public class CanWithdrawBankAccount extends DecoratorBankAccount {

    private final int overdraft;
    public CanWithdrawBankAccount(BankAccount base, int overdraft) {
        super(base);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(int amount) {
        if (this.getBalance() + this.overdraft < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount);
    }
}
