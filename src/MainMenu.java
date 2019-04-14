/**
 * This is the MainMenu class, this is a simple text based menu GUI to allow the user to move around
 * the program before moving into a full GUI based system in the future. After a full GUI is
 * implemented this will be deprecated.
 * 
 * @author Dalton Senseman
 * @since 2019-04-12
 */

import java.util.Scanner;

public class MainMenu {

  public static void mainMenu() {
    System.out.println("    Welcome to: Tales of the High Seas");
    System.out.println("       an RPG game coded in Java!");
    System.out.println("\t _____________________ ");
    System.out.println("\t|      MAIN MENU      |");
    System.out.println("\t|---------------------|");
    System.out.println("\t|  1: New Game        |");
    System.out.println("\t|  2: Load Game       |");
    System.out.println("\t|  3: Settings        |");
    System.out.println("\t|  4: Java Demos      |");
    System.out.println("\t|  5: Quit Game       |");
    System.out.println("\t|_____________________|");
  }

  public static void mainMenuSelection(Scanner input) {
    int gameMenuSelection = 0;
    while (gameMenuSelection <= 0 || gameMenuSelection > 5) {
      gameMenuSelection = InputValidation.getGoodPositiveInt(input);

      if (gameMenuSelection <= 0 || gameMenuSelection > 5) {
        MainMenu.mainMenu();
      }
      switch (gameMenuSelection) {
        case 1:
          System.out.println("Game Start");
          MainGame.GameStart(input);
          break;
        case 2:
          System.out.println("Game loading not implemented yet.");
          mainMenu();
          gameMenuSelection = 0;
          continue; // lets the loop continue after this case is finished working.
        case 3:
          System.out.println("Settings implemented yet.");
          mainMenu();
          gameMenuSelection = 0;
          continue;
        case 4:
          System.out.println("Launching Java Demos.");
          JavaDemos.javaDemoMenu();
          JavaDemos.JavaDemoMenuSelection(input);
          mainMenu();
          gameMenuSelection = 0;
          continue;
        case 5:
          char terminationValue = 'N';
          while (terminationValue != 'Y') {
            System.out.println("Do you wish to exit? Y for yes, N for no.");
            terminationValue = InputValidation.getGoodCharValue(input);
            if (terminationValue == 'Y') {
              System.exit(0); // Closes the program FULL Termination!
            } else if (terminationValue == 'N') {
              break; // breaks out of this loop if N to then jump back into the menu selection.
            }
          }
          mainMenu();
          gameMenuSelection = 0;
          continue;
      }
    }
  }
}
