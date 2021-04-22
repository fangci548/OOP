package oop.hw;

public class Bulbasaur extends Pokemon { //繼承Pokemon的寶可夢

  public Bulbasaur(String nickName, PokemonType type, int cp) { //繼承抽象類別，要寫他的建構子
    super(nickName, type, cp);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void attack() { //抽象類別，寫方法
    // TODO Auto-generated method stub
    System.out.println("Tackle…");
  }

}
