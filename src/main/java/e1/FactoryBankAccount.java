package e1;

public interface FactoryBankAccount {
    BankAccount createSilverAccount(int fee);

    BankAccount createGoldAccount(int overdraft);

    BankAccount createBronzeAccount(int fee, int minimumWithdraw);
}
