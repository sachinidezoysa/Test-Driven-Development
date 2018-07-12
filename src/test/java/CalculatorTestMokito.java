import org.junit.After;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTestMokito {

    Calculator calculator = null;

    CalculatorService calculatorService = mock(CalculatorService.class);

    @Before
    public void setUpJ() throws Exception{

        calculator =new Calculator(calculatorService);
        System.out.println("Before Test completed");
    }

    @After
    public void tearDownJ() throws Exception{

        System.out.println("After Test completed");
    }

    @org.junit.jupiter.api.Test
    void add() throws Exception{

        assertEquals(10, Calculator.add(10, 0), "10 + 0 must be 10");
    }

    @org.junit.jupiter.api.Test
    void multiply() throws Exception{

        assertEquals(0, Calculator.multiply(10, 0), "10 x 0 must be 0");
    }

    @org.junit.jupiter.api.Test
    void minus() throws Exception{

        assertEquals(10, Calculator.minus(10, 0), "10 - 0 must be 10");
    }

    @org.junit.jupiter.api.Test
    void divide() throws Exception{

        when(calculatorService.divide(10,5)).thenReturn(2);
        assertEquals(1, Calculator.divide(10, 10), "10 / 10 must be 1");
    }
}