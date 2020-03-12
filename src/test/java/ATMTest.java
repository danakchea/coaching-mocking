import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.fail;

public class ATMTest {

    @Mock
    ATMService atmService;

    @Test
    public void getBalanceTest()
    {
        atmService.getBalance();
    }
}
