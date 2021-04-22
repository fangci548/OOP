package fcu.oop.h1;

public class BmiCalculator {
  private static double bmi;
  /**
   * bmi.
   * @param weight weight.
   * @param height height.
   * @return
   */
  
  public static double getBmi(double weight, double height) {
    return weight / (height * height);
  }
  
  public static String getBmi(String weight, String height) {
    bmi = getBmi(Double.parseDouble(weight), Double.parseDouble(height));
    return String.valueOf(bmi);
  }

}
