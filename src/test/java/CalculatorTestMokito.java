import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTestMokito {

    private Calculator calculator = null;
    private Constants constants = null;//object that need to mock

    public void create(){

        calculator = mock(Calculator.class);
        when(calculator.multiplyCons(10, 10, 10)).thenReturn(1000);//config it to return 1000 when  args passed as given
        verify(calculator).multiplyCons(10,10,10);

        when(calculator.multiplyStatic(10, 10, 10)).thenReturn(1000);//config it to return 1000 when  args passed as given
        verify(calculator).multiplyStatic(10,10,10);
    }

    @Before
    public void setUpJ() throws Exception{

        calculator =new Calculator(constants);//create mock object
        System.out.println("Before Test completed");
    }

    @After
    public void tearDownJ() throws Exception{

        System.out.println("After Test completed");
    }

    @Test
    void add() throws Exception{

        assertEquals(10, Calculator.add(10, 0), "10 + 0 must be 10");
    }

    @Test
    void multiply() throws Exception{

        assertEquals(0, Calculator.multiply(10, 0), "10 x 0 must be 0");
    }

    @Test
    void minus() throws Exception{

        assertEquals(10, Calculator.minus(10, 0), "10 - 0 must be 10");
    }

    @Test
    void divide() throws Exception{

        assertEquals(1, Calculator.divide(10, 10), "10 / 10 must be 1");
    }

}