/*
 * RNG system to calculate rolls of any type that we need for the game.
 * 
 * @author Dalton Senseman
 * 
 * @since 2019-04-12
 */

import java.util.Random;

public class RNGSystem {
  static Random RNG = new Random();
  // fields
  private static int diceTotal;

  // methods
  /*
   * Rolls n number of dice, with n number of sides, and then sums them into diceTotal. in this
   * roller I have a header which is the name of the method and the part within the ( ) is the
   * parameters which arguments are passed to to then be used inside the code block.
   */
  public static void setRoll(int numOfDice, int numOfSides) {
    diceTotal = 0;
    for (int i = 1; i <= numOfDice; i++) {
      diceTotal += RNG.nextInt(numOfSides) + 1;
      if (numOfDice >= 5) {
        break; // Stops loop if initial dice is >= 5 to stop cheating.
      }
    }
  }

  public static int getRoll() {
    return diceTotal;
  }
}
