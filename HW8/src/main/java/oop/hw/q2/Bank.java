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
    // 1. �إߤ@�ӷs�b��(Account)����
    // 2. �s��Account�����balance���Ȭ�100
    account.setBalance(100);
    account.setPersonId(personId);
    // 3. �ˬdlist����

    boolean create;
    if (accounts.size() >= 10) {
      create = false;
    } else {
      create = true;
    }
    // 4. ��list���פj�󵥩�10�ɡA�h�^��false�A�_�h�^��true
    if (accounts.size() < 10) {
      accounts.add(account);
    }
    // 5. �Ylist���פp��10�A�h�N�s��account�[�Jlist��
    return create;
  }

  /**
   * withdraw.
   * @param personId withdraw id.
   * @param money withdraw money.
   * @return
   */
  public float withdraw(String personId, float money) {
    // 1. �qaccounts�����PpersonId��Account����
    int accountIndex = 0;
    for (int i = 0; i < 10; i++) {
      if (accounts.get(i).getPersonId().equals(personId)) {
        accountIndex = i;
      }
    }
    // 2. �q�Ӫ���balance��촣�ڪ����B�A�Ymoney
    accounts.get(accountIndex).setBalance(accounts.get(accountIndex).getBalance() - money);
    // 3. �^�ǧ�s�᪺balance��
    if (accounts.get(accountIndex).getBalance() < 0) {
      return -1;
    } else {
      return accounts.get(accountIndex).getBalance();
    }
    // 4. �Y��s�᪺balance�Ȥp��0�A�h�^��-1
  }

  /**
   * deposit.
   * @param personId deposit id.
   * @param money deposit money.
   * @return
   */
  public float deposit(String personId, float money) {
    // 1. �qaccounts�����PpersonId��Account����
    int accountIndex = 0;
    for (int i = 0; i < 10; i++) {
      if (accounts.get(i).getPersonId().equals(personId)) {
        accountIndex = i;
      }
    }
    // 2. ��s�Ӫ���balance���ȡA�Y�[�W�s�ڪ����B(money)
    accounts.get(accountIndex).setBalance(accounts.get(accountIndex).getBalance() + money);
    // 3. �^�ǧ�s�᪺balance��
    return accounts.get(accountIndex).getBalance();
  }

  /**
   * get.
   * @return
   */
  public List<Account> getAccounts() {
    // 1. �^��accounts
    return accounts;
    // 2. �`�N�~���u��Ū��Bank���󤤩Ҧ���Account�A���L�k�ק�
  }

}
