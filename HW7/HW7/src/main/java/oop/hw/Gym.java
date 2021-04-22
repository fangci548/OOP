package oop.hw;

public class Gym {
  
  public void fight(Pokemon pokemon) { //用多型，減少程式碼的重複 寶可夢都是繼承Pokemon 可直接用Pokemon寫方法
    pokemon.attack();
  }

} 