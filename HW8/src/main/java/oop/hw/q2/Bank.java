package oop.hw.q2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<Account> accounts = new ArrayList<Account>();

  /**
   * create account.
   * @param personId create account.
   * @return
   */
  public boolean createAccount(String personId) {
    Account account = new Account();
    // 1. 建立一個新帳號(Account)物件
    // 2. 新的Account物件其balance的值為100
    account.setBalance(100);
    account.setPersonId(personId);
    // 3. 檢查list長度

    boolean create;
    if (accounts.size() >= 10) {
      create = false;
    } else {
      create = true;
    }
    // 4. 當list長度大於等於10時，則回傳false，否則回傳true
    if (accounts.size() < 10) {
      accounts.add(account);
    }
    // 5. 若list長度小於10，則將新的account加入list中
    return create;
  }

  /**
   * withdraw.
   * @param personId withdraw id.
   * @param money withdraw money.
   * @return
   */
  public float withdraw(String personId, float money) {
    // 1. 從accounts中找到同personId的Account物件
    int accountIndex = 0;
    for (int i = 0; i < 10; i++) {
      if (accounts.get(i).getPersonId().equals(personId)) {
        accountIndex = i;
      }
    }
    // 2. 從該物件的balance減到提款的金額，即money
    accounts.get(accountIndex).setBalance(accounts.get(accountIndex).getBalance() - money);
    // 3. 回傳更新後的balance值
    if (accounts.get(accountIndex).getBalance() < 0) {
      return -1;
    } else {
      return accounts.get(accountIndex).getBalance();
    }
    // 4. 若更新後的balance值小於0，則回傳-1
  }

  /**
   * deposit.
   * @param personId deposit id.
   * @param money deposit money.
   * @return
   */
  public float deposit(String personId, float money) {
    // 1. 從accounts中找到同personId的Account物件
    int accountIndex = 0;
    for (int i = 0; i < 10; i++) {
      if (accounts.get(i).getPersonId().equals(personId)) {
        accountIndex = i;
      }
    }
    // 2. 更新該物件的balance的值，即加上存款的金額(money)
    accounts.get(accountIndex).setBalance(accounts.get(accountIndex).getBalance() + money);
    // 3. 回傳更新後的balance值
    return accounts.get(accountIndex).getBalance();
  }

  /**
   * get.
   * @return
   */
  public List<Account> getAccounts() {
    // 1. 回傳accounts
    return accounts;
    // 2. 注意外部只能讀此Bank物件中所有的Account，但無法修改
  }

}
