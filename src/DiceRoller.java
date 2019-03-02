/*
 * Dalton Senseman - This is the DiceRolling class for all the RNG need of the game from attacks,
 * skills, loot tables, really anything the game needs to be randomized will be licked to a dice
 * roll like in DnD.
 */

import java.util.Random;

public class DiceRoller {
  static Random Dice = new Random(); // Random method so the dice system works with random ints or doubles

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
      diceTotal += Dice.nextInt(numOfSides) + 1;
      if (numOfDice >= 5) {
        break; // Stops loop if initial dice is >= 5 to stop cheating.
      }
    }
  }

  public static int getRoll() {
    return diceTotal;
  }
}
