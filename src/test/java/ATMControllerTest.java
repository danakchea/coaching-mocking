import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ATMControllerTest {

    ATMController atmControllerTrue;
    ATMController atmControllerFalse;
    ATMController atmController;

    ATMService atmService;

    @Before
    public void setup() {
        atmService = mock ( ATMService.class );
        atmControllerTrue = new ATMController ( atmService , true );
        atmControllerFalse = new ATMController ( atmService , false );
        atmController = new ATMController ( atmService );
    }

    @Test
    public void getBalanceTestTrue()
    {
        when(atmService.getBalance()).thenReturn(10.00);
        assertEquals ( 10.00 , atmControllerTrue.getBalance () ,1 );
    }

    @Test
    public void getBalanceTestFalse()
    {
        when(atmService.getBalance()).thenReturn(10.00);
        assertEquals ( 00.00 , atmControllerFalse.getBalance () ,1 );
    }

    @Test
    public void getBalanceTestNormal()
    {
        when(atmService.getBalance()).thenReturn(10.00);
        assertEquals ( 10.00 , atmController.getBalance () ,1 );
    }

}
