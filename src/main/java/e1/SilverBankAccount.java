package e1;

public class SilverBankAccount extends DecoratorBankAccount {

    public static final int FEE_WITHDRAW = 1;

    public SilverBankAccount(BankAccount base) {
        super(base);
    }

    @Override
    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount + 1);
    }
}
