import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorIUnitTestWithMockito {

    Calculator calculator;
    Constants constants;

    @Before
    public void setUp() throws Exception {
        constants = mock(Constants.class);
        calculator = new Calculator(constants, 10);

        System.out.println("Before Test completed");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Test completed");
    }

    @Test
    public void add() {
        int printInt = calculator.add(1,2);
        Assert.assertEquals(3,printInt);
    }

    @Test
    public void multiply() {
        int printInt = calculator.multiply(1,2);
        Assert.assertEquals(2,printInt);
    }

    @Test
    public void multiplyByScalor() {
        int printInt = calculator.multiplyByScalor(1,2);
        Assert.assertEquals(20,printInt);
    }

    @Test
    public void multiplyByGravity() {
        when(calculator.multiplyByGravity(10, 10, 10)).thenReturn(10);//config it to return 1000 when  args passed as given
        int printInt = calculator.multiplyByGravity(1,2,10);
        Assert.assertEquals(20,printInt);
    }

    @Test
    public void minus() {
        int printInt = calculator.minus(2,1);
        Assert.assertEquals(1,printInt);
    }

    @Test
    public void divide() throws ArithmeticException{
        int printInt = calculator.divide(2,2);
        Assert.assertEquals(1,printInt);
    }
}