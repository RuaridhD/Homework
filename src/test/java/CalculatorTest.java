import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator(4, 6);
    }

    @Test
    public void calcAdds(){
        assertEquals(10, testCalculator.add());
    }


}
