/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Se STRANGE W
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
  public static void main(String[] argv) {

      String sPhoneNumber = "605-8889999";
      //String sPhoneNumber = "605-88899991";
      //String sPhoneNumber = "605-888999A";

      Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
      Matcher matcher = pattern.matcher(sPhoneNumber);

      if (matcher.matches()) {
          System.out.println("Phone Number Valid");
      } else {
          System.out.println("Phone Number must be in the form XXX-XXXXXXX");
      }
  }
}
