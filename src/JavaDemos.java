/**
 * This is the java demo section for parts of the project that I couln't find a spot for within the
 * main game, in here will be code that shows off basic java ideas.
 * 
 * @author Dalton Senseman
 * @since 2019-04-12
 */
import java.util.Scanner;

public class JavaDemos {
  public static void javaDemoMenu() {
    System.out.println("\t _____________________ ");
    System.out.println("\t|      Java MENU      |");
    System.out.println("\t|---------------------|");
    System.out.println("\t|  1: Strings         |");
    System.out.println("\t|  2: Java Information|");
    System.out.println("\t|  3: Operators       |");
    System.out.println("\t|  4: Arrays          |");
    System.out.println("\t|  5: Main Menu       |");
    System.out.println("\t|_____________________|");
  }

  public static void JavaDemoMenuSelection(Scanner input) {
    int javaMenuSelection = 0;
    while (javaMenuSelection <= 0 || javaMenuSelection > 5) {
      javaMenuSelection = InputValidation.getGoodPositiveInt(input);

      if (javaMenuSelection <= 0 || javaMenuSelection > 5) {
        javaDemoMenu();
      }
      switch (javaMenuSelection) {
        case 1:
          System.out.println("Loading String demo.");
          javaStringDemo();
          javaMenuSelection = 0;
          javaDemoMenu();
          continue;
        case 2:
          System.out.println("Loading Java information demo.");
          javaInformationlist();
          javaMenuSelection = 0;
          javaDemoMenu();
          continue;
        case 3:
          System.out.println("Loading Operator demo.");
          javaOperatorDemo();
          javaMenuSelection = 0;
          javaDemoMenu();
          continue;
        case 4:
          System.out.println("Loading Array Sorting demo.");
          JavaArrayDemos.arraySumDemo();
          JavaArrayDemos.arraySmallestValue();
          JavaArrayDemos.array2dDemo();
          JavaArrayDemos.arrayListDemo();
          javaMenuSelection = 0;
          javaDemoMenu();
          continue;
        case 5:
          char menuTerminationValue = 'N';
          while (menuTerminationValue != 'Y') {
            System.out.println("Do you wish to exit? Y for yes, N for no.");
            menuTerminationValue = InputValidation.getGoodCharValue(input);
            if (menuTerminationValue == 'Y') {
              break;
            } else if (menuTerminationValue == 'N') {
              javaDemoMenu();
              javaMenuSelection = 0;
              break;
            }
          }

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
    System.out
        .println("for the computer the greet1 String is greater since it appears later in the "
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
