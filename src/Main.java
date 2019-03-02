import java.util.Scanner;

/*
 * Dalton Senseman - This is my main driver for my integration project, in here I plan on creating a
 * text based game where you can create a character, and play in a RPG style world leveling up and
 * interacting with other NPC (non-Player_Charaters) as well as fighting and crafting items. I will
 * update this as I go and add more features to this RPG game.
 */

public class Main {

  public static void main(String[] args) {
    Scanner rawInput = new Scanner(System.in);
    final String STARTLOCATION = "unknown sandy beach" ;
    GameMenu.mainMenu();
    GameMenu.mainMenuSelection(rawInput); // lets the scanner from main be used in other class
    boolean finalCharacterAccept = false;
    do {
      boolean quiteGame = false;
      String characterArray[] = GameMenu.playercreationPart1(rawInput);
      int characterStatArray[] = GameMenu.playercreationPart2(rawInput);
      /*
       * creates the players character using the array values given by Gamemenu with this
       * constructor PlayerCharacter we are calling to make the object and inside the ( ) is the
       * arguments which the user has provided in the playerCreationPart1 and 2 methods these are
       * sent back to this constructor passing as arguments to the PlayerCharacterClass to then make
       * a instance of the PlayerCharacter object.
       */
      PlayerCharacter mainCharacter = new PlayerCharacter(characterArray[0], characterArray[1],
          characterStatArray[0], characterStatArray[1], characterStatArray[2]);

      System.out.println("Your name is: " + mainCharacter.getFullName());
      System.out.println("Your age is: " + mainCharacter.getAge());
      System.out.println("Your height is: " + mainCharacter.getHeight() + "\"");
      System.out.println("Your weight is: " + mainCharacter.getWeight() + "lbs");
      System.out.println("Is this your final Character? Y / N");

      if (rawInput.next().charAt(0) == 'Y') { // tests to see if user accepts to exit loop
        finalCharacterAccept = true;
      } else
        finalCharacterAccept = false;
      System.out.println("Charater Created!");

      String gameWelcomeMessage = "You wake up on a " + STARTLOCATION + " the sun bakeing your "
          + "skin, as you "
          + "look around you notice a sword pointing at your chest. The gruff figure bellows in "
          + "a commanding voice for you to stay still or they will gut you.";
      int enemyHealth = 10;
      System.out.println(gameWelcomeMessage);
      System.out.println(" __________________________");
      System.out.println("| 1. Fight | 2. Hold Still |");
      System.out.println("|__________|_______________|");
      int menuActionSelection = rawInput.nextInt();
      String menuActionSelectionChoice = (menuActionSelection == 1) ?
          "You Try to attack!!" : "You have been gutted and have died";
      System.out.println(menuActionSelectionChoice);
      if (menuActionSelection == 1) {
        do {
          mainCharacter.setAttack(1, 8);
          System.out.println("You attack again!");
          enemyHealth -= mainCharacter.getAttack();

        } while (enemyHealth >= 0);
      } else
        System.exit(0);
      System.out.println("With your fast thinking you manage to catch the man off guard"
          + ", with a kick you knock down them into the sandy beach sand and pummel them.");
      System.out.println("You stand up and look around at your surroundings before you go "
          + "do you look at the man and loot his body?.");
      System.out.println(" __________________________");
      System.out.println("| 1. Loot  | 2. Move on    |");
      System.out.println("|__________|_______________|");
      menuActionSelection = rawInput.nextInt();
      if (menuActionSelection == 1) {
       DiceRoller.setRoll(1,20);
        if (DiceRoller.getRoll() > 7) {
          mainCharacter.setCoinPurse(10.5);
          System.out.println("You found 10 silver and 5 copper coins!");
        } else 
          System.out.println("You found nothing.....");
      } else System.out.println("You look around to see were you can go.");
      System.out.println("You look around to see were you can go.");
      
      if (quiteGame == true) {
        break; // breaks out of the game loop to exit game unsupported option at the moment.
      }
    } while (finalCharacterAccept == false);
    System.exit(0);

    rawInput.close();
  }
}