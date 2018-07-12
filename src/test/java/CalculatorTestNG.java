import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTestNG {

    @BeforeTest
    void setUp(){

        System.out.println("Before Test completed");
    }

    @AfterTest
    void tearDown(){

        System.out.println("After Test completed");
    }

    @org.testng.annotations.Test
    public void testAdd() {

        assertEquals(10, Calculator.add(10, 0), "10 + 0 must be 10");
    }

    @org.testng.annotations.Test
    public void testMultiply() {

        assertEquals(100, Calculator.multiply(10, 10), "10 + 0 must be 10");
    }

    @org.testng.annotations.Test
    public void testMinus() {

        assertEquals(10, Calculator.minus(10, 0), "10 + 0 must be 10");
    }

    @org.testng.annotations.Test
    public void testDivide() {

        assertEquals(10, Calculator.divide(10, 1), "10 + 0 must be 10");
    }
}