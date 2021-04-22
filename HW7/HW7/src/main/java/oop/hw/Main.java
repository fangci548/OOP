package oop.hw;

public class Main {
  /**
   * Main.
   * @param args Main.
   */

  public static void main(String[] args) {
    Bulbasaur pkm1 = new Bulbasaur("I am Bulbasaur", PokemonType.GRASS, 123);
    System.out.println("Name : I am " + pkm1.getNickName());
    System.out.println("Type :" + pkm1.getType());
    System.out.println("Cp :" + pkm1.getCp());
    Gym gym = new Gym();
    gym.fight(pkm1); //傳入不同型態，多型會自己去找對應的方法
    System.out.println("\n");
    
    Charmander pkm2 = new Charmander("I am Charmander", PokemonType.FIRE, 456);
    System.out.println("Name : I am " + pkm2.getNickName());
    System.out.println("Type :" + pkm2.getType());
    System.out.println("Cp :" + pkm2.getCp());
    gym.fight(pkm2); //傳入不同型態，多型會自己去找對應的方法
    System.out.println("\n");
    
    Psyduck pkm3 = new Psyduck("I am Psyduck", PokemonType.WATER, 89);
    System.out.println("Name : I am " + pkm3.getNickName());
    System.out.println("Type :" + pkm3.getType());
    System.out.println("Cp :" + pkm3.getCp());
    gym.fight(pkm3); //傳入不同型態，多型會自己去找對應的方法
    System.out.println("\n");
  }

}
