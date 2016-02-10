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

  HashMap<String, String> teens = new HashMap<String, String>();

  teens.put("0", "ten");
  teens.put("1", "eleven");
  teens.put("2", "twelve");
  teens.put("3", "thirteen");
  teens.put("4", "fourteen");
  teens.put("5", "fifteen");
  teens.put("6", "sixteen");
  teens.put("7", "seventeen");
  teens.put("8", "eighteen");
  teens.put("9", "nineteen");

  String onesPlace = "";
  String onesResult = "";
  String tensResult = "";

  HashMap<String, String> tens = new HashMap<String, String>();


  tens.put("2", "twenty");
  tens.put("3", "thirty");
  tens.put("4", "forty");
  tens.put("5", "fifty");
  tens.put("6", "sixty");
  tens.put("7", "seventy");
  tens.put("8", "eighty");
  tens.put("9", "ninety");

  String tensPlace = "";

  char[] charArray = number.toCharArray();
  for ( int i = charArray.length -1; i >= 0; i--){
    String numberValue = (Character.toString(charArray[i]));
      if ((i == 0) && (ones.containsKey(numberValue))) {
        String value = ones.get(numberValue);
        onesResult = onesPlace.concat(value);
      }if ((i == 1) && (tens.containsKey(numberValue))) {
        String tensValue = tens.get(numberValue);
        tensResult = tensValue.concat(onesPlace);
      }
    }
    String result = tensResult.concat(onesResult);
    return result;
  }
}
