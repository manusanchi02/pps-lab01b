package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BronzeBankAccountTest extends CoreBankAccountTest {

    private final static int MINIMUM_WITHDRAW = 100;
    private final static int FEE_WITHDRAW = 1;

    @Override
    @BeforeEach
    void init() {
        FactoryBankAccount factory = new FactoryBankAccountImpl();
        this.account = factory.createBronzeAccount(FEE_WITHDRAW, MINIMUM_WITHDRAW);
    }

    @Override
    @Test
    public void testCanWithdraw() {
        this.account.deposit(BASE_DEPOSIT);
        this.account.withdraw(TEST_WITHDRAW);
        assertEquals(BASE_DEPOSIT - TEST_WITHDRAW - FEE_WITHDRAW, this.account.getBalance());
    }
}
