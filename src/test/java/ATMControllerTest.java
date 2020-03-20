import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

public class ATMControllerTest {

    @Mock
    ATMController atmController;

    @InjectMocks
    ATMService atmService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getBalanceTestEqual()
    {
        when(atmController.getBalance()).thenReturn(20.00);
        assertEquals(atmService.getBalance(),atmController.getBalance(),1);
    }

    @Test
    public void getBalanceTestNotEquals()
    {
        when(atmController.getBalance()).thenReturn(31.00);
        assertNotEquals(atmService.getBalance(),atmController.getBalance(),1);
    }
}
