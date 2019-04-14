/*
 * Character class holds all the information every character should have regardless if it is player
 * controlled
 * 
 * @author Dalton Senseman
 * 
 * @since 2019-04-12
 */

public abstract class Character {
  RNGSystem Roll = new RNGSystem();
  // fields
  private String firstName;
  private String lastName;
  private String fullName;

  private int age;
  private int height;
  private int weight;
  private int attack;

  private double coinPurse;

  // constructor
  public Character(String firstName, String lastName, int age, int height, int weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = firstName + " " + lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public Character() {

  }

  // methods
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }

  public void setCoinPurse(double coins) {
    coinPurse += coins;
  }

  public double getCoinPurse() {
    return coinPurse;
  }

  public void setAttack(int hitCount, int dammageCount) {
    RNGSystem.setRoll(1, 20);
    int baseRoll = RNGSystem.getRoll();
    if (baseRoll > 0 && baseRoll < 20) {
      RNGSystem.setRoll(hitCount, dammageCount);
      attack = RNGSystem.getRoll();
      System.out.println("You hit for: " + getAttack());
    } else if (baseRoll == 20) {
      System.out.println("Critical hit!");
      RNGSystem.setRoll(hitCount, dammageCount);
      System.out.println("You hit for: " + (int) Math.pow(getAttack(), 2.5));
      /*
       * I have the power going to the 2.5 so to make sure the number is a int I used casting to
       * force it back into a int truncating the remaining decimal so HP is decreased in whole
       * numbers while having the possibility of extra damage to be added to the damage roll
       */
    } else
      System.out.println("You have Missed!");;
  }

  public int getAttack() {
    return attack;
  }
}
