package fcu.oop.h2;

import java.util.Scanner;

public class Main {
  /**
   * This is account set.
   * @param args account set.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    Account account = new Account();
    String inputPassword;
    inputPassword = scanner.next();
    account.setPassword(inputPassword);
    System.out.print(account.getPassword());
    
    scanner.close();
  }

}
