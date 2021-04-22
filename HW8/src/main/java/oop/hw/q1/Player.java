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

    randomNum[0] = (int) (Math.random() * 4); //用陣列存random number 代表三個隨機變數
    randomNum[1] = (int) (Math.random() * 4);
    randomNum[2] = (int) (Math.random() * 4);

    Symbol[] symbol = new Symbol[3]; //用symbol陣列存三個symbol物件

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
    if (randomNum[0] == randomNum[1] && randomNum[1] == randomNum[2]) { //若三者相同 則reward增加
      reward = symbol[0].getValue(); //取第一個的value (因為三個都相同~~)
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
