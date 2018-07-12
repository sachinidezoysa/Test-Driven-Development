import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CalculatorTestJUnitwithMokito {

    Calculator calculator;
    Constants constants;

        @Before
        public void setUpJ() throws Exception{

            constants = mock(Constants.class);
            when(calculator.multiplyByGravity(10, 10, 10)).thenReturn(1000);//config it to return 1000 when  args passed as given
            verify(calculator).multiplyByGravity(10,10,10);

            System.out.println("Before Test completed");
        }

        @After
        public void tearDownJ() throws Exception{

            System.out.println("After Test completed");
        }

        @Test
        void add() throws Exception{

            assertEquals(10, calculator.add(10, 0), "10 + 0 must be 10");
        }

        @Test
        void multiply() throws Exception{

            assertEquals(0, calculator.multiply(10, 0), "10 x 0 must be 0");
        }

        @Test
        void minus() throws Exception{

            assertEquals(10, calculator.minus(10, 0), "10 - 0 must be 10");
        }

        @Test
        void divide() throws Exception{

            assertEquals(1, calculator.divide(10, 10), "10 / 10 must be 1");
        }

        @Test
        void multiplyStatic() throws Exception{

            assertEquals(100, calculator.multiplyByScalor(10, 10), "10 / 10 must be 1");
        }

        @Test
        void multiplyCons() throws Exception{

            assertEquals(100, calculator.multiplyByGravity(10, 10, 10), "10 / 10 must be 1");
        }
}