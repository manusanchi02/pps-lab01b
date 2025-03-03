package e1;

public class FactoryBankAccountImpl implements FactoryBankAccount{

    @Override
    public BankAccount createAccount(int fee) {
        return new FeeBankAccount(new CanWithdrawBankAccount(new CoreBankAccount()), fee);
    }
}
