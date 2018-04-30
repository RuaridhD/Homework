import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle testWaterBottle;

    @Before
    public void before(){
        testWaterBottle = new WaterBottle(100);
    }

    @Test
    public void volumeDecreases() {
        assertEquals(90, testWaterBottle.drink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, testWaterBottle.empty());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, testWaterBottle.fill());
    }

}
