package e1;

class DecoratorBankAccount implements BankAccount {

    protected final BankAccount base;

    public DecoratorBankAccount(BankAccount account) {
        this.base = account;
    }

    public int getBalance() {
        return this.base.getBalance();
    }

    public void deposit(int amount) {
        this.base.deposit(amount);
    }

    public void withdraw(int amount) {
        this.base.withdraw(amount);
    }
}
