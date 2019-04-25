/**
 * This program is a demonstration of what I have learned in COP-2006, inside the program I plan to
 * have a demo program for java examples along with the start of a basic RPG text game. Features
 * will be added as I continue forward in the class.
 * 
 * @author Dalton Senseman
 * @version 3.0
 * @since 2019-04-12
 */

import java.util.Scanner;

public class Main {

  /**
   * Main driver of the program.
   * @param args convention name for the main driver
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    MainMenu.mainMenu();
    MainMenu.mainMenuSelection(input); // Method call with the argument input being passed to it
  }

}
