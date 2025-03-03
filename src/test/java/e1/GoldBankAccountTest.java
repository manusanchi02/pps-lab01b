package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GoldBankAccountTest extends CoreBankAccountTest{

    private final static int OVERDRAFT = 500;

    @Override
    @BeforeEach
    void init(){
        FactoryBankAccount factory = new FactoryBankAccountImpl();
        this.account = factory.createGoldAccount(OVERDRAFT);
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        this.account.deposit(BASE_DEPOSIT);
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(OVERDRAFT + BASE_DEPOSIT + 1));
    }

}
