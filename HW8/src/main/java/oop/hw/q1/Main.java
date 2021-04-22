package oop.hw.q1;

import java.util.Scanner;

public class Main {
  /**
   * main code.
   * @param args main code.
   */
  public static void main(String[] args) { //main code.
  
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    String tmpBalance = scanner.next();
    int balance = Integer.valueOf(tmpBalance);
    Player player = new Player(name, balance);
    player.play();
    
    scanner.close();
  }

}
