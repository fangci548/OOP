package oop.hw;

public class OrderCake extends Cake {
  public double weight; //額外成員變數
  /**
   * order.
   * @param name order.
   * @param rate order.
   * @param weight order.
   */
  
  public OrderCake(String name, double rate, double weight) {
    super(name, rate);
    this.weight = weight;
    // TODO Auto-generated constructor stub
  }

  @Override
  public double calcPrice() { //override父類別
    // TODO Auto-generated method stub
    return super.getRate() * weight;
  }

}
