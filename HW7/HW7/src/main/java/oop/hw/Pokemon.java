package oop.hw;

public abstract class Pokemon implements Fightable {

  @Override
  public abstract void attack(); //��H��k�A���l���O��@
  
  private String nickName;
  private PokemonType type;
  private int cp;
  /**
   * Pokemon.
   * @param nickName Nickname.
   * @param type Type.
   * @param cp Cp.
   */
  

  public Pokemon(String nickName, PokemonType type, int cp) {
    this.nickName = nickName;
    this.cp = cp;
    this.type = type;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public int getCp() {
    return cp;
  }

  public void setCp(int cp) {
    this.cp = cp;
  }

  public PokemonType getType() {
    return type;
  }
}
