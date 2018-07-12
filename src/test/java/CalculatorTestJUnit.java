import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

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

        @Test
        void multiplyStatic() throws Exception{

            assertEquals(1000, Calculator.multiplyScalor(10, 10, 10), "10 / 10 must be 1");
        }

        @Test
        void multiplyCons() throws Exception{

            assertEquals(1000, Calculator.multiplyByGravity(10, 10, 10), "10 / 10 must be 1");
        }
}