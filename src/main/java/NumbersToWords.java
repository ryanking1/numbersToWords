import java.io.Console;
import java.util.Map;
import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;

public class NumbersToWords {
  public static void main(String[] args) {

  }

public static String inputNumber(String number) {
  HashMap<String, String> ones = new HashMap<String, String>();

  ones.put("1", "one");
  ones.put("2", "two");
  ones.put("3", "three");
  ones.put("4", "four");
  ones.put("5", "five");
  ones.put("6", "six");
  ones.put("7", "seven");
  ones.put("8", "eight");
  ones.put("9", "nine");

  String onesPlace = "";

  char[] charArray = number.toCharArray();
  for ( int i = charArray.length -1; i >= 0; i--){
    String numberValue = (Character.toString(charArray[i]));
      if (ones.containsKey(numberValue)) {
        String value = ones.get(numberValue);
        onesPlace = onesPlace.concat(value);
      } else {
        return onesPlace;
      }
    }
    return onesPlace;
  }
}
