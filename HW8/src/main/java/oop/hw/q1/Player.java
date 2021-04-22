package oop.hw.q1;

public class Player {

  private String name;
  private int balance;

  Player(String name, int balance) {
    this.name = name;
    this.balance = balance;
  }
  /**
   * play code.
   */
  
  public void play() { 
    this.setBalance(this.getBalance() - 5);
    int[] randomNum = new int[3];

    randomNum[0] = (int) (Math.random() * 4); //�ΰ}�C�srandom number �N��T���H���ܼ�
    randomNum[1] = (int) (Math.random() * 4);
    randomNum[2] = (int) (Math.random() * 4);

    Symbol[] symbol = new Symbol[3]; //��symbol�}�C�s�T��symbol����

    for (int i = 0; i < 3; i++) {
      if (randomNum[i] == 0) {
        symbol[i] = new Cherry();
      } else if (randomNum[i] == 1) {
        symbol[i] = new Lemon();
      } else if (randomNum[i] == 2) {
        symbol[i] = new Watermelon();
      } else {
        symbol[i] = new Seven();
      }
    }

    int reward;
    System.out.printf("%s,%s,%s\n", symbol[0].getName(), symbol[1].getName(), symbol[2].getName());
    if (randomNum[0] == randomNum[1] && randomNum[1] == randomNum[2]) { //�Y�T�̬ۦP �hreward�W�[
      reward = symbol[0].getValue(); //���Ĥ@�Ӫ�value (�]���T�ӳ��ۦP~~)
      this.setBalance(this.getBalance() + reward);
    } else {
      reward = 0;
    }
    System.out.println("Reward: " + reward);
    System.out.println("Balance: " + this.getBalance());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

}
