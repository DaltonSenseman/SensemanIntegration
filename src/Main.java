import java.util.Scanner;

public class Main {
  // Program coded by: Dalton R. Senseman
  /*
   * At the moment this program has no function but to show case my current abilities but I plan to
   * create a elaborate text-based survival game to well demonstrate my coding capabilities and
   * understanding of the Java language.
   */



  public static void main(String[] args) {
    
    String oneSuper = Character.toString((char)'\u00B9');
    String threeSuper = Character.toString((char)'\u00B3');

    System.out.println("Please enter your name:");

    Scanner rawInput = new Scanner(System.in); // Scanner to grab information 
    String userName = rawInput.next(); //Grabs a user name from user
    
    System.out.println("Hello, and welcome to my intergation project " + userName + "!");
    System.out.println("To start with I will go over many of the primitive data types in Java.");
    System.out.print("There are 8 primitive data types in total: ");
    System.out.println("byte, short, int, long, float, double, boolean, and char.");
    System.out.println("");
    
    //byte description
    System.out.println("First, lets go over what a byte is.");
    System.out.println("A byte is a numerical value that can hold 8-bits of data " + 
     "and can hold a value from -128 to +127, anything larger will overflow; " + 
     "this value type is not often used but is handy for arrays, or memory management.");
    System.out.println("");
    
    //short description
    System.out.println("Next, we have the short data type.");
    System.out.println("A short is a numerical value that can hold 16-bits of data " +
    "and can hold a value from -32,768 to +32,767, larger values will overflow. " +
    "This value is also not used often except for memory management or in arrays.");
    System.out.println("");
    
    //int description
    System.out.println("Next, is the int data type.");
    System.out.println("The int is the default numerical value type and most commonly used. " + 
    "It is capable of holding 32-bits of data from -2" + threeSuper + oneSuper + " to +2" +
    threeSuper + oneSuper + "-1. Larger values will overflow");
    System.out.println("");
    
    //long description
    System.out.println("Next, is the long data type.");
    System.out.println("The long is 64-bit numerical value type and is used when the number is " +
    "larger then what a int can hold, a long must end with the letter L, and is capable of " + 
    "holding a value from -2^61 to +2^61 -1.");
    System.out.println("");
    
    //float description
    System.out.println("Next, is the float data type.");
    System.out.println("The float is a 32-bit precision floating numerical value type. " + 
    "It holds decimal numbers and like a byte it is used for memory management. " + 
    "This data type is never to be used for Currency or other precise values.");
    System.out.println("");
    
    //double description
    System.out.println("Next, is the double data type.");
    System.out.println("The double is a 64-bit precision floating numerical value type. " + 
    "It holds decimal numbers and is the default choice for floating vaules, but just like " + 
    "shorts they must never be used for Currency or precise values. ");
    System.out.println("");
    
    //boolean description
    System.out.println("Next, is the boolean data type. ");
    System.out.println("Booleans are a simple comparison tool used to check if values are " + 
    "True or False, booleans are ofen used as a way to control the progession of code. ");
    System.out.println("");
    
    //Char description
    System.out.println("Last of the primitive data types is the char. ");
    System.out.println("A char is a single 16-bit unicode charater from u0000 - uffff " + 
    "and they are wrapped in single quotations '_'. ");
    System.out.println("");
    System.out.println("");
    
    //Show case of how booleans work
    System.out.println("To show you how a \"boolean\" works please enter a value from 1 to 10:");
    int booleanValue1 = rawInput.nextInt();
    System.out.println("The boolean should show false, if the value you entered was less then 5, " + 
    "and True if the value is greater then five.");
    boolean booleanAnswer = booleanValue1 > (int)5;
    System.out.println("Your value came back as: " + booleanAnswer + ".");
    System.out.println("");
    
    //Show case how ints work
    System.out.println("To show you how a \"int\" works please enter a value from 1 to 10:");
    int intTestValue1 = rawInput.nextInt();
    System.out.println("And another value from 1 to 10:");
    int intTestValue2 = rawInput.nextInt();
    System.out.println("Ints are often used in math and as you can see they can be added " + 
    "togeather");
    int intTestAnswer = intTestValue1 + intTestValue2;
    System.out.println("The result of " + intTestValue1 + " added to " + intTestValue2 + 
    " equals " + intTestAnswer + ".");
    System.out.println("");
    
    //Show case how doubles work
    System.out.println("To show you how a \"double\" works please enter a value with some " + 
    "decimal value up to the hundreds place from 1.0 to 10.0:");
    double doubleTestValue1 = rawInput.nextDouble();
    System.out.println("And another value up to the hundreds place from 1.0 to 10.0:");
    double doubleTestValue2 = rawInput.nextDouble();
    System.out.println("Like ints doubles are often used in math operations, but they can hold " + 
    "decimal answers unlike an int which will truncate anything to the right of a decimal point.");
    double doubleTestAnswer = doubleTestValue1 - doubleTestValue2;
    System.out.println("The answer if you subtract " + doubleTestValue1 + " from " + 
    doubleTestValue2 + " is " + doubleTestAnswer + ".");
    System.out.println("");
    
    rawInput.nextLine();
    
    //Talk about and show case Strings
    System.out.println("A different type of data I didn't go over is the String, a string " + 
    "unlike the other types above is a object instead of a primitive data type. But being " + 
    "and object made of chars allows us to use many \"methods\" to return copys of the string in " + 
    "different forms. Since Strings themselves are immutable");
    System.out.println("One fun thing you can do to strings is concatenate them, or in " + 
    "better terms append more text to the end of another.");
    System.out.println("Please enter a sentance:");
    String messageNumber1 = rawInput.nextLine() + " ";
    System.out.println("Please enter another sentance: ");
    String messageNumber2 = rawInput.nextLine() + " ";
    System.out.println("Your full message was:");
    System.out.println(messageNumber1 + messageNumber2);
    System.out.println("");
    
    System.out.println("Another topic is the FINAL, they are global immutable data types " + 
    "Once they have been declared and assigned they can never be changed." + 
    "If you use a FINAL the name must be all Caps and something that is never going to change.");
    System.out.println("Such as pi:");
    final double PI = 3.1415926535;
    System.out.println(PI);
     
    /* Scope 
     * Is the visibility of code to the user or other classes of code, code inside a class is local
     * and can't be used inside another class nor visible to a user, code that is Global can be 
     * used in all classes but still unknown to a user. Users don't need to see how a program works
     * they just need to be able to use it.
     * */
    
    /*Variables
     * is a location in memory where data is stored it points to the data location.
     * */
    
    /*Casting
     * Casting is when you alter or change a data type into another like going from a int to a
     * short, where you can tell java that even if your using ints this one value is to be short
     * or the answer is to become a short, be careful though as when you move to a smaller number
     * you can overflow the data and get a entirely wrong answer, or from a double to a int loose
     * data in the case of truncating. Java may also automatically do this like if you add a int
     * to a double the answer will be a double since a double supersedes a int
     * */
    
    
    
    rawInput.close();
    
    

  }
}


