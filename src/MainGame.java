/**
 * Main Game menu that holds the start of the RPG game.
 * 
 * @author Dalton Senseman
 * @since 2019-04-12
 */

import java.util.Scanner;

public class MainGame {
  /**  
   * Starts and drives the game section of this program from the main menu.
   * @param input passes the scanner to be used in the method.
   */
  public static void gameStart(Scanner input) {
    /*
     * CheckStyle marks this final as improper but final conventions in java 
     * states to have it is to CAPLOCKED.
     */
    final String STARTLOCATION = "unknown sandy beach"; 
    boolean finalCharacterAccept = false;
    do {
      String[] characterArray = playercreationPart1(input);
      int[] characterStatArray = playercreationPart2(input);

      PlayerCharacter mainCharacter = new PlayerCharacter(characterArray[0], characterArray[1],
          characterStatArray[0], characterStatArray[1], characterStatArray[2]);

      System.out.println("Your name is: " + mainCharacter.getFullName());
      System.out.println("Your age is: " + mainCharacter.getAge());
      System.out.println("Your height is: " + mainCharacter.getHeight() + "\"");
      System.out.println("Your weight is: " + mainCharacter.getWeight() + "lbs");
      System.out.println("Is this your final Character? Y / N");
      char responceToCharacter = InputValidation.getGoodCharValue(input);
      if (responceToCharacter == 'Y') { // tests to see if user accepts to exit loop
        finalCharacterAccept = true;
      } else {
        finalCharacterAccept = false;
        System.out.println("Charater Created!");
      }
      String gameWelcomeMessage = "You wake up on a " + STARTLOCATION + " the sun bakeing your "
          + "skin, as you "
          + "look around you notice a sword pointing at your chest. The gruff figure bellows in "
          + "a commanding voice for you to stay still or they will gut you.";
      int enemyHealth = 10;
      System.out.println(gameWelcomeMessage);
      System.out.println(" __________________________");
      System.out.println("| 1. Fight | 2. Hold Still |");
      System.out.println("|__________|_______________|");
      int menuActionSelection = InputValidation.getGoodPositiveInt(input);
      String menuActionSelectionChoice =
          (menuActionSelection == 1) ? "You Try to attack!!" : "You have been gutted and have died";
      System.out.println(menuActionSelectionChoice);
      if (menuActionSelection == 1) {
        do {
          mainCharacter.setAttack(1, 8);
          System.out.println("You attack again!");
          enemyHealth -= mainCharacter.getAttack();

        } while (enemyHealth >= 0);
      } else {
        System.exit(0);
      }
      System.out.println("With your fast thinking you manage to catch the man off guard"
          + ", with a kick you knock down them into the sandy beach sand and pummel them.");
      System.out.println("You stand up and look around at your surroundings before you go "
          + "do you look at the man and loot his body?.");
      System.out.println(" __________________________");
      System.out.println("| 1. Loot  | 2. Move on    |");
      System.out.println("|__________|_______________|");
      menuActionSelection = InputValidation.getGoodPositiveInt(input);
      if (menuActionSelection == 1) {
        RngSystem.setRoll(1, 20);
        if (RngSystem.getRoll() > 7) {
          mainCharacter.setCoinPurse(10.5);
          System.out.println("You found 10 silver and 5 copper coins!");
        } else {
          System.out.println("You found nothing.....");
        }
      } else {
        System.out.println("You look around to see were you can go.");
        System.out.println("You look around to see were you can go.");

        break;
      }
    } while (finalCharacterAccept == false);
  }

  /**
   * Part 1 of the character creation to gather user input and pass it to the player constructor.
   * @param input passes the scanner into this method to be used.
   * @return the character array after being validated as good input is passed to the constructor.
   */
  public static String[] playercreationPart1(Scanner input) {
    String[] characterArray = new String[2];
    System.out.println("Enter your first Name:");
    characterArray[0] = InputValidation.getGoodStringValue(input);
    System.out.println("Enter your last Name:");
    characterArray[1] = InputValidation.getGoodStringValue(input);
    return characterArray;
  }

  /**
   * Part 2 of the character creation to gather user input and pass it to the player constructor.
   * @param input passes the scanner into this method to be used.
   * @return the character array after being validated as good input is passed to the constructor.
   */
  public static int[] playercreationPart2(Scanner input) {
    int[] characterStatArray = new int[3];
    System.out.println("Enter your age:");
    characterStatArray[0] = InputValidation.getGoodPositiveInt(input);
    System.out.println("Enter your height in inches:");
    characterStatArray[1] = InputValidation.getGoodPositiveInt(input);
    System.out.println("Enter your weight in pounds:");
    characterStatArray[2] = InputValidation.getGoodPositiveInt(input);
    return characterStatArray;
  }
}
