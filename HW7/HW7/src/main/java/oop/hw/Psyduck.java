package oop.hw;

public class Psyduck extends Pokemon { //�~��Pokemon���_�i��

  public Psyduck(String nickName, PokemonType type, int cp) { //�~�ө�H���O�A�n�g�L���غc�l
    super(nickName, type, cp);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void attack() { //��H���O�A�g��k
    System.out.println("Aqua Tail�K");
  }

}
