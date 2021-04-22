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
      int a = (int) (Math.random() * 2); //�����ܼ�
      if (a == 0) { //0�ɲ���OrderCake���� 1�ɲ���ReadyMadeCake����
        System.out.println("�s�WOrderCake����:");
        String name = scanner.next();
        double rate = scanner.nextDouble();
        double weight = scanner.nextDouble();
        cake[i] = new OrderCake(name, rate, weight);
      } else {
        System.out.println("�s�WReadyMadeCake����:");
        String name = scanner.next();
        double rate = scanner.nextDouble();
        int quantity = scanner.nextInt();
        cake[i] = new ReadyMadeCake(name, rate, quantity);
      }
    }
    double highestPrice = cake[0].calcPrice(); //���Ĥ@�ӷ�̰���

    double allCakePrice = 0;
    for (int i = 0; i < 5; i++) { 
      allCakePrice += cake[i].calcPrice(); //�[�`�J�|�`����
      if (highestPrice < cake[i].calcPrice()) { //�Y�O��e�J�|���氪��̰��� ���̰�������
        highestPrice = cake[i].calcPrice();
      }
    }
    System.out.println("All: " + allCakePrice);

    double readyPrice = 0;
    int readyquantity = 0;
    for (int i = 0; i < 5; i++) {
      if (cake[i].getClass().getName().equals("oop.hw.ReadyMadeCake")) { //�P�_����O�_��ReadyMadeCake
        readyPrice += cake[i].calcPrice();
        ReadyMadeCake ready = (ReadyMadeCake) cake[i]; //�Ncake�૬��ReadyMadeCake���� �èϥ�getQuantity
        readyquantity += ready.getQuantity();
      }
    }
    System.out.println("Ready Price & Quantity: " + readyPrice + "  " + readyquantity);
    System.out.println("High: " + highestPrice);
    scanner.close();
  }
}
