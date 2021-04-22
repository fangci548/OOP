package oop.hw;

public class ReadyMadeCake extends Cake {
  
  private int quantity; //額外成員變數
  /**
   * make.
   * @param name make.
   * @param rate make.
   * @param quantity make.
   */
  
  public ReadyMadeCake(String name, double rate, int quantity) {
    super(name, rate);
    this.quantity = quantity;
    // TODO Auto-generated constructor stub
  }

  @Override
  public double calcPrice() { //override父類別
    // TODO Auto-generated method stub
    return super.getRate() * quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  
}
