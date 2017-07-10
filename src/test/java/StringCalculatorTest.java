import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void returnZeroWhenAnEmptyStringIsPassed() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void returnTheSumOfNumbersWhenAStringSeparatedByCommaIsPassed() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(25, stringCalculator.add("1,2,10,12"));
    }

    @Test
    public void returnTheSumOfNumbersAndIgnoreInitWhenAStringSeparatedByCommaIsPassed() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(7, stringCalculator.add(",5,2"));
    }

    @Test
    public void returnTheSumOfNumbersAndIgnoreEndWhenAStringSeparatedByCommaIsPassed() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(5, stringCalculator.add("3,2,"));
    }
}
