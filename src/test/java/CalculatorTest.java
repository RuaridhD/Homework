import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator(6, 4);
    }

    @Test
    public void calcAdds(){
        assertEquals(10, testCalculator.add(), 0.01);
    }

    @Test
    public void calcSubtracts(){
        assertEquals(2, testCalculator.subtract(), 0.01);
    }

    @Test
    public void calcMultiplies(){
        assertEquals(24, testCalculator.multiply(), 0.01);
    }

    @Test
    public void calcDivides(){
        assertEquals(1.5, testCalculator.divide(), 0.01);
    }


}
