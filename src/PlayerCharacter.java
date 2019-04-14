
public class PlayerCharacter extends Character {

  /*
   * Inheritance - As you can see in this class I have an extends character above. This is
   * inheritance. It allows me to have a more general class that all characters can have, yet have a
   * child class which is this class that can use ALL the code from Character plus its own unique
   * code in here that is different or overloads the character classes methods. It allows us to be
   * more effective with our code and use it to lower the amount of code that is redundant as their
   * is not point to have a bunch of methods in each class that all do the same thing if we can just
   * point a class to use a shared method.
   */

  public PlayerCharacter(String firstName, String lastName, int age, int height, int weight) {
    super(firstName, lastName, age, height, weight);
    // TODO Auto-generated constructor stub
  }

  // fields
  private double coinPurse;
  private int gold;

  // methods
  public void setCoinPurse(double coins, int gold) {
    coinPurse += coins;
    gold += gold;
  }

  public double getGoldPurse() {
    return (double) gold;
  }

  public double getCoinPurse() {
    return coinPurse;
  }
}
