package oop.hw;

public abstract class Cake {
  private String name;
  private double rate;
  /**
   * cake.
   * @param name cake.
   * @param rate cake.
   */
  
  public Cake(String name, double rate) {
    super();
    this.name = name;
    this.rate = rate;
  }
  
  public abstract double calcPrice(); 
  
  public String toString() {
    return name + "\t" + rate;
  }

  public String getName() {
    return name;
  }

  public double getRate() {
    return rate;
  }
  
}
