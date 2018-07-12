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
        when(calculator.multiplyByGravity(10, 10, 10)).thenReturn(1000);//config it to return 1000 when  args passed as given
        verify(calculator).multiplyByGravity(10,10,10);
    }

}