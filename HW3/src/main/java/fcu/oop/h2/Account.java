package fcu.oop.h2;

public class Account {
  
  private String name;
  private String account;
  private String password;
  private double balance;
  static final double INTEREST_RATE = 0.0155;
  
  public Account() {
    
  }
  
  public Account(String name) {
    this.name = name;
  }
  
  public String getPassword() {
    return password;
  }
  /**
   * set password.
   * @param password set password.
   */
  
  public void setPassword(String password) {
    String regex =  "^(?=.*[A-Z])(?=.*[0-9]).{2,}$";
    if (password.matches(regex) == true) {
      this.password = password;
    } else {
      this.password = null;
    }
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAccount() {
    return account;
  }
  /**
   * set account.
   * @param account set account.
   */
  
  public void setAccount(String account) {
    if (account.contains("@") && account.contains(".")) {
      if (account.lastIndexOf(".") > account.lastIndexOf("@")) {
        this.account = account;
      }
    } else {
      System.out.println("Mistake!");
      this.account = null;
    }
  }
  
  public double getBalance() {
    return balance;
  }
  
  public void setBalance(double balance) {
    this.balance = balance;
  }
  
  public double getInterest() {
    return balance * INTEREST_RATE;
  }
  
  public double deposite(int depositeMoney) {
    return depositeMoney + balance;
  }
  
  public double withdraw(int withdrawMoney) {
    return balance - withdrawMoney;
  }
  
}
