import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer testPrinter;

    @Before
    public void before(){
        testPrinter = new Printer(50, 50);
    }

    @Test
    public void sheetsDecreaseAfterPrinting(){
        assertEquals(40, testPrinter.print(2, 5));
    }

    @Test
    public void notEnoughSheetsToPrint(){
        Printer lowPaperPrinter = new Printer(5, 5);
        assertEquals(5, lowPaperPrinter.print(2, 5));
    }

    @Test
    public void fillThePrinter(){
        assertEquals(50, testPrinter.fill());
    }

//    @Test
//    public void tonerDecreasesAfterPrinting(){
//        assertEquals(49, testPrinter.print(2,5));
//    }
//}



