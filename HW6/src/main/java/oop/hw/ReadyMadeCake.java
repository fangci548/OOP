package oop.hw;

public class ReadyMadeCake extends Cake {
  
  private int quantity; //�B�~�����ܼ�
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
  public double calcPrice() { //override�����O
    // TODO Auto-generated method stub
    return super.getRate() * quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  
}
