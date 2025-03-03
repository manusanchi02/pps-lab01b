package e1;

public interface FactoryBankAccount {
    public BankAccount createSilverAccount(int fee);

    public BankAccount createGoldAccount(int overdraft);
}
