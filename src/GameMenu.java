import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Dalton Senseman - This is the menu class for all the menus that will run for this program. In
 * here I'll have the main menu, and the sub menus for the game. Inventory will be handled in its
 * own separate class though
 */

public class GameMenu {
  // Fields

  // Methods

  public static void mainMenu() { // prints the title menu for the game
    System.out.println("Welcome to: Tales of the High Seas");
    System.out.println("   an RPG game coded in Java!");
    System.out.println("     _____________________ ");
    System.out.println("    |      MAIN MENU      |");
    System.out.println("    |---------------------|");
    System.out.println("    |  1: New Game        |");
    System.out.println("    |  2: Load Game       |");
    System.out.println("    |  3: Settings        |");
    System.out.println("    |  4: Java Information|");
    System.out.println("    |  5: Operator Demo   |");
    System.out.println("    |  6: String Demo     |");
    System.out.println("    |  7: Quit Game       |");
    System.out.println("    |_____________________|");
  }
  /*
   * This is the main menu selection switch each case will go to different sub menus or trigger a
   * method for the subject matter of that particular menu, such as settings will call for a setting
   * menu once that is implemented.
   * 
   */
  public static void mainMenuSelection(Scanner rawInput) { // Grabs the scanner from main
    int gameMenuSelection = 0;
    while (gameMenuSelection <= 0 || gameMenuSelection >= 8) { // Menu stays until good input
      try {
        gameMenuSelection = rawInput.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Not a valid number: Pick a option 1 - 4");
        rawInput.next();
      }

      switch (gameMenuSelection) {
        case 1:
          System.out.println("Game Start");
          break;
        case 2:
          System.out.println("Not implemented yet.");
          mainMenu();
          gameMenuSelection = 0;
          continue; 
          /* the continue allows the loop to keep going skipping this iteration 
           * so other options can be selected if this was a break instead the program
           * would terminate after completing this case.
           */
        case 3:
          System.out.println("Not implemented yet.");
          mainMenu();
          gameMenuSelection = 0;
          continue;
        case 4:
          System.out.println("Here is some information about Java.");
          javaInformationlist();
          mainMenu();
          gameMenuSelection = 0;
          continue;
        case 5:
          System.out.println("Here is a Demo useing some of Java's Operators!");
          javaOperatorDemo();
          mainMenu();
          gameMenuSelection = 0;
          continue;
        case 6:
          javaStringDemo();
          mainMenu();
          gameMenuSelection = 0;
          continue;
        case 7:
          System.exit(0); // Closes the program FULL Termination!
      }
    }
  }

  private static void javaStringDemo() {
    System.out.println("Welcome to the String Demo here I will show you some neat things you can "
        + "do with Strings!");
    System.out.println("Strings are a special data type that is native to Java but not really"
        + " apart of the primitive data types since it is really an array of chars. ");
    System.out.println("But since it is a Class it has tons of methods we can use to "
        + "create edited copys of a string to do all sorts of operations with like:");
    System.out.println(" ");
    System.out.println("Compareing Strings! When you use the == operator on a string it will "
        + "Compare the memory locations of the strings not if the content is the same, like "
        + "with numerical uses of the == . ");
    System.out.println("");
    System.out.println("To compare the Strings content you must use the method .equals() "
        + "This will compare the strings based on their data.");
    System.out.println("So if we have a string called s1 and we compare it to a String called "
        + "s2 and both hold the value \"Yes I am a String!\" ");
    System.out.println("");
    String s1 = "Yes I am a String!";
    String s2 = "Yes I am a String!";
    boolean s3 = s1.equals(s2);
    System.out.println("This will return as a boolean saying yes s1 is the same as s2 giving us "
        + "the value: " + s3);
    System.out.println("");
    System.out.println("Another awesome feature of the String class is the compareTo() method "
        + "This method compares strings lexicographically one which string comes before the other"
        + "This is helpfull to sort things alphabetically but be careful as it is case-sensitive");
    System.out.println("Lets take this as a example, we have a String called greet1 which holds "
        + "the value \"Hello my freind!\" and another "
        + "called greet2 which holds \"Afternoon!\" and we compare 1 to 2 what would we get?");
    String greet1 = "Hello my freind!!";
    String greet2 = "Afternoon!";
    int compareString1to2 = greet1.compareTo(greet2);
    System.out.println(compareString1to2);
    System.out.println("Well that is weird why did we get a number? Well when we compare the "
        + "Strings the computer looks at the first letter and sees H is 7 letters after A so ");
  System.out.println("for the computer the greet1 String is greater since it appears later in the "
        + "alphabet thus sorting the strings into the order of which one comes first "
        + "and what one comes after!");
    System.out.println("");
    
  }
  public static void javaInformationlist() {
    System.out.print(" _____________________________________________________________________");
    System.out.println("____________________________________________________________________");
    System.out.print("|byte:    a 8-bit data type from -128 - 127. ");
    System.out.println("It is used for legacy support and memory managment. ");
    System.out.print("|short:   a 16-bit data type from -32,768 - 32,767.  ");
    System.out.println("It is used for legacy support and memory managment as well.");
    System.out.print("|int:     a 32-bit data type from -2^31 - (2^31-1). ");
    System.out.println("The int is the most used and default number data type of Java.");
    System.out.print("|long:    a 64-bit data type from -2^63 - (2^63-1). ");
    System.out.println("A large number denoted by a ending L to hold values larger then an int.");
    System.out.print("|float:   a 32-bit single precision 754 floating point. ");
    System.out.println("It is used for memory saving, and never used for precise values.");
    System.out.print("|double:  a 64-bit double precision 754 floating point. It is the ");
    System.out.println("default data type for decimals, and not may not used for precise values.");
    System.out.println("|boolean: a True or False holding value used for flags and logic.");
    System.out.print("|char:    a 16-bit unicode character from U0000 to a max value of ");
    System.out.println("UFFFF, they are single characters unlike \'Strings\' which hold mutiple.");
    System.out.println("| ");
    System.out.print("|Scope:   Is the ability to access data, the scope limits what data can ");
    System.out.println("be accessed within the program, class, and method that is is used in.");
    System.out.print("|Variable: Like in math a variable is container that holds some value, ");
    System.out.println("but unlike in math these variables point to a location in memory.");
    System.out.print("|FINAL:   a FINAL is a unique data type that is global in scope and,");
    System.out.println(" Immutable where once assigned it may never be changed again.");
    System.out.println("|");
    System.out.print("|Operator precedence: This is the system in java the dictactes what is, ");
    System.out.println("evaluated first much like PEMDAS in mathmatics. ");
    System.out.println("|In Java this starts with Postfix then going down to assignmenton at end.");
    System.out.print("|_____________________________________________________________________");
    System.out.println("____________________________________________________________________");
    System.out.println("");

  }

  public static String[] playercreationPart1(Scanner rawInput) {
    String characterArray[] = new String[2];
    System.out.println("Enter your first Name:");
    characterArray[0] = rawInput.next();
    System.out.println("Enter your last Name:");
    characterArray[1] = rawInput.next();
    return characterArray;
  }

  public static int[] playercreationPart2(Scanner rawInput) {
    int characterStatArray[] = new int[3];
    System.out.println("Enter your age:");
    characterStatArray[0] = rawInput.nextInt();
    System.out.println("Enter your height in inches:");
    characterStatArray[1] = rawInput.nextInt();
    System.out.println("Enter your weight in pounds:");
    characterStatArray[2] = rawInput.nextInt();
    return characterStatArray;
  }
  
  public static void javaOperatorDemo() {
    System.out.println("In Java you can use many different operators!");
    System.out.println("Such as basic math operators.");
    System.out.println("");
    System.out.println("Like multiplication denoted with * in Java. ");
    int demoAnswer1 = 5 * 2; 
    System.out.println("So ints like 5 * 2 can be evaluated to: " + demoAnswer1);
    System.out.println("");
    System.out.println("Others like division are written as follows 20 / 5.");
    int demoAnswer2 = 20 / 5;
    System.out.println("Which is naturally: " + demoAnswer2);
    System.out.println("");
    int demoAnswer3 = 7 % 3;
    System.out.println("A special operator in Java is called the modulus which returns the "
        + "remainder of divisions like such as 7 / 3 = 2.33333. But if we use a modulus "
        + "instead of 2.333 we would get the answer: " + demoAnswer3);
    System.out.println("This tells us that there is a remainder!");
    System.out.println("This is handy for figureing out if something evenly goes into another "
        + " number so we can grab even or odd numbers quickly");
    System.out.println("");
    System.out.println("Other cool operators you can use in java are the increment and decrement "
        + "short hands denoted by a trailing ++ or -- these add or subtract 1 to a value and are "
        + "Very handy for loops!");
    int demoAnswer4 = 5;
    demoAnswer4--;
    System.out.println("If given this expression num1 = num1 - 1 we can short hand this to "
        + "num1-- where if num1 started at 5 we would then get: " + demoAnswer4);
    System.out.println("");
    
  }
}