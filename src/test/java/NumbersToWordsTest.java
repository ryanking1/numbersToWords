import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class NumbersToWordsTest {

  @Test
  public void numbersToWords_returnAsWordforNumber_3() {
    NumbersToWords numbersToWords= new NumbersToWords();
    assertEquals("three", numbersToWords.inputNumber("3"));
  }
  @Test
  public void numbersToWords_returnAsWordforNumber_22() {
    NumbersToWords numbersToWords= new NumbersToWords();
    assertEquals("twentytwo", numbersToWords.inputNumber("22"));
  }
}
