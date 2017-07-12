import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void returnZeroWhenAnEmptyStringIsPassed() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void returnTheSameNumberWhenANumberIsPassedAsString() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(13, stringCalculator.add("13"));
    }

    @Test
    public void returnTheSumWhenAStringOfTwoNumbersSeparatedByCommaIsPassed() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(12, stringCalculator.add("7,5"));
    }

    @Test
    public void returnTheSumOfNumbersAndIgnoreEmptyValueInInitOfStringSeparatedByComma() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(7, stringCalculator.add(",5,2"));
    }

    @Test
    public void returnTheSumOfNumbersAndIgnoreEmptyValueInMiddleOfStringSeparatedByComma() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(8, stringCalculator.add("1,5,,2"));
    }

    @Test
    public void returnTheSumOfNumbersAndIgnoreEmptyValueInEndOfStringSeparatedByComma() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(5, stringCalculator.add("3,2,"));
    }
}
