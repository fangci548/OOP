package fcu.oop.h1;

import java.util.Scanner;

public class Main {
  /**
   * calculator.
   * @param args Bmi calculator.
   */
  public static void main(String[] args) {
    String bmi;
    Scanner scanner = new Scanner(System.in);
    String weight = scanner.next();
    String height = scanner.next();
    bmi = BmiCalculator.getBmi(weight, height);
    System.out.print(bmi);
    
    scanner.close();
  }

}
