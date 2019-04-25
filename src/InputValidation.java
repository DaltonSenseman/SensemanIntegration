/**
 * This is the Validation class for getting acceptable input from the user using java exceptions to
 * make sure the values inputed into the scanner will not cause the program to terminate.
 * 
 * @author Dalton Senseman
 * @since 2019-04-12
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidation {

  /**
   * Gets a good integer from the user that will not cause an exception on bad input.
   * @param input passes the scanner into the method.
   * @return returns the selected input of the user as long as it is acceptable.
   */
  public static int getGoodPositiveInt(Scanner input) {
    int inputSelection = 0;
    try {
      inputSelection = input.nextInt();
    } catch (InputMismatchException ex) {
      System.out.println("Not a valid number: please input a whole number that is greater then 0.");
      input.next();
    }
    return inputSelection;
  }

  /**
   * Gets a good char value from the user that will not cause an exception on bad input.
   * @param input passes the scanner into the method.
   * @return returns the selected input of the user as long as it is acceptable.
   */
  public static char getGoodCharValue(Scanner input) {
    String inputSelection = " ";
    try {
      inputSelection = input.next();
    } catch (InputMismatchException ex) {
      System.out.println("Not a valid answer: please input a single character excluding numbers and"
          + " Symbols.");
      input.next();
    }
    char inputSelctionfinal = inputSelection.toUpperCase().charAt(0);
    return inputSelctionfinal;
  }

  /** 
   *  Gets a good String value from the user that will not cause a exception on bad input.
   * @param input passes the scanner into the method.
   * @return returns the selected input of the user as long as it is acceptable. 
   */
  public static String getGoodStringValue(Scanner input) {
    String inputSelection = " ";
    try {
      inputSelection = input.next();
    } catch (InputMismatchException ex) {
      System.out
          .println("Not a valid answer: please input word excluding numbers and" + " Symbols.");
      input.next();
    }
    return inputSelection;
  }
}
