package e1;

public class FactoryBankAccountImpl implements FactoryBankAccount{

    @Override
    public BankAccount createSilverAccount(int fee) {
        return new FeeBankAccount(new CanWithdrawBankAccount(new CoreBankAccount(), 0), fee);
    }

    @Override
    public BankAccount createGoldAccount(int overdraft) {
        return new FeeBankAccount(new CanWithdrawBankAccount(new CoreBankAccount(), overdraft), 0);
    }

}
