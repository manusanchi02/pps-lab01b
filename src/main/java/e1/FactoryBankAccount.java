package e1;

public interface FactoryBankAccount {
    public BankAccount createSilverAccount(int fee);

    public BankAccount createGoldAccount(int overdraft);

    public BankAccount createBronzeAccount(int fee, int minimumWithdraw);
}
