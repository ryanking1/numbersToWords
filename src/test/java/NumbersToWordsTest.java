import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class NumbersToWordsTest {

  @Test
  public void numbersToWords_returnAsWordforNumber_1() {
    NumbersToWords numbersToWords= new NumbersToWords();
    assertEquals("one", numbersToWords.inputNumber("1"));
  }
}
