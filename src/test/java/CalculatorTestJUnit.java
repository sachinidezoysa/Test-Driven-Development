import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestJUnit {

    @Before
    public void setUpJ() throws Exception{

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

        assertEquals(1, Calculator.divide(10, 10), "10 / 10 must be 1");
    }
}