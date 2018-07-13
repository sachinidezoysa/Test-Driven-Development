import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;

public class CalculatorTestNGWithMockito {

    Calculator calculator;
    Constants constants;

    @BeforeTest
    void setUp(){
        constants = mock(Constants.class);
        calculator = new Calculator(constants, 10);
        System.out.println("Before Test completed");
    }

    @AfterTest
    void tearDown(){
        System.out.println("After Test completed");
    }

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(10, 0), "10 + 0 must be 10");
    }

    @Test
    public void testMultiply() {

        assertEquals(100, calculator.multiply(10, 10), "10 + 0 must be 10");
    }

    @Test
    public void testMinus() {

        assertEquals(10, calculator.minus(10, 0), "10 + 0 must be 10");
    }

    @Test
    public void testDivide() {

        assertEquals(10, calculator.divide(10, 1), "10 + 0 must be 10");
    }

    @Test
    public void multiplyByStatic() {

        assertEquals(1000, calculator.multiplyByScalor(10, 10), "10 + 0 must be 10");
    }

    @Test
    void multiplyCons() throws Exception{
        when(calculator.multiplyByGravity(10, 10, 10)).thenReturn(10);//config it to return 1000 when  args passed as given
        assertEquals(1000, calculator.multiplyByGravity(10, 10, 10), "10 / 10 must be 1");
    }
}