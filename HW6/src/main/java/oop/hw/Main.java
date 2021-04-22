package oop.hw;

import java.util.Scanner;

public class Main {
  /**
   * main cake.
   * 
   * @param args main cake.
   */

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Cake[] cake = new Cake[5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      int a = (int) (Math.random() * 2); //產生變數
      if (a == 0) { //0時產生OrderCake物件 1時產生ReadyMadeCake物件
        System.out.println("新增OrderCake物件:");
        String name = scanner.next();
        double rate = scanner.nextDouble();
        double weight = scanner.nextDouble();
        cake[i] = new OrderCake(name, rate, weight);
      } else {
        System.out.println("新增ReadyMadeCake物件:");
        String name = scanner.next();
        double rate = scanner.nextDouble();
        int quantity = scanner.nextInt();
        cake[i] = new ReadyMadeCake(name, rate, quantity);
      }
    }
    double highestPrice = cake[0].calcPrice(); //拿第一個當最高價

    double allCakePrice = 0;
    for (int i = 0; i < 5; i++) { 
      allCakePrice += cake[i].calcPrice(); //加總蛋糕總價格
      if (highestPrice < cake[i].calcPrice()) { //若是當前蛋糕價格高於最高價 更改最高價價格
        highestPrice = cake[i].calcPrice();
      }
    }
    System.out.println("All: " + allCakePrice);

    double readyPrice = 0;
    int readyquantity = 0;
    for (int i = 0; i < 5; i++) {
      if (cake[i].getClass().getName().equals("oop.hw.ReadyMadeCake")) { //判斷物件是否為ReadyMadeCake
        readyPrice += cake[i].calcPrice();
        ReadyMadeCake ready = (ReadyMadeCake) cake[i]; //將cake轉型為ReadyMadeCake物件 並使用getQuantity
        readyquantity += ready.getQuantity();
      }
    }
    System.out.println("Ready Price & Quantity: " + readyPrice + "  " + readyquantity);
    System.out.println("High: " + highestPrice);
    scanner.close();
  }
}
