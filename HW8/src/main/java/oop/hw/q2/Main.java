package oop.hw.q2;

import java.util.ArrayList;
import java.util.List;

public class Main {

  /**
   * main.
   * @param args main code.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Bank bank = new Bank();
    for (int i = 0; i < 13; i++) {
      String id = String.valueOf(i);
      bank.createAccount(id);
    }
    List<Account> accounts = new ArrayList<Account>();
    accounts = bank.getAccounts();

    for (Account account : accounts) {
      System.out.println(account);
    }
  }

}
