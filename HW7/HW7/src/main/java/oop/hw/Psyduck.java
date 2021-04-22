package oop.hw;

public class Psyduck extends Pokemon { //繼承Pokemon的寶可夢

  public Psyduck(String nickName, PokemonType type, int cp) { //繼承抽象類別，要寫他的建構子
    super(nickName, type, cp);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void attack() { //抽象類別，寫方法
    System.out.println("Aqua Tail…");
  }

}
