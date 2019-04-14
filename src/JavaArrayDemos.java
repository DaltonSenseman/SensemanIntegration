import java.util.ArrayList;

/*
 * Array Demos for array types
 * 
 * @author Dalton Senseman
 * 
 * @since 2019-04-12
 */

public class JavaArrayDemos {

  public static void arraySumDemo() {
    System.out.println("We can use arrays to crate a runnign total by useing a accumulator, "
        + "to keep a grand total. In this demo We will take the first 10 even numbers from 0-20"
        + " and add them useing this method we should see 110 as the result.");
    int[] arraySumNumbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int accumulator = 0;
    for (int i : arraySumNumbers) {
      accumulator += i;
    }
    System.out.println("The total sum of the even array is indeed " + accumulator + ".");
  }

  public static void arraySmallestValue() {
    System.out.println("We can also use arrays to sort and find values shuch as the smallest or "
        + "greatest number in the array set.");
    int[] arrayFindSmall = {14, 22, 3, 69, 34, 23, 56, 166, 86, 2, 78, 12};
    int smallest = arrayFindSmall[0];
    for (int i : arrayFindSmall) {
      if (smallest > i) {
        smallest = i;
      } else {
        continue;
      }
    }
    System.out.println("In this array the smallest number was: " + smallest);
    System.out.println("We can also look through this array to find a value, this case we will "
        + "look for the value 166, which should be at location 7");
    for (int k = 0; k < arrayFindSmall.length; k++) {
      if (arrayFindSmall[k] == 166) {
        System.out.println("Found the value 166 at location: [" + k + "]");
      }
    }
  }

  public static void array2dDemo() {
    int[][] twoDArray = new int[2][4];
    for (int i = 0; i < twoDArray.length; i++) {
      for (int j = 0; j < twoDArray[i].length; j++) {
        twoDArray[i][j] = 5;
      }
    }
    twoDArray[1][2] = 10;
    System.out.println("We can also Search an array for a value in this case, we will look for"
        + " the value 10 in a 2 X 4 array. We set the value at 1 x 2 to hold the value 10.");
    for (int i = 0; i < twoDArray.length; i++) {
      for (int j = 0; j < twoDArray[i].length; j++) {
        if (twoDArray[i][j] == 10) {
          System.out.println("Found the value ten at location: [" + i + "]" + "[" + j + "]");
        }
      }
    }
  }

  public static void arrayListDemo() {
    System.out.println("We can also use the newer version of Arrays to do the same things, "
        + "this is an ArrayList in java. It has all the same features of an array but, unlike"
        + " arrays these arrays can be mutated and sizes can change and vary.");
    ArrayList<Double> demoList = new ArrayList<>();
    demoList.add(14.5);
    demoList.add(34.76);
    demoList.add(10.3);
    demoList.add(3.43);
    demoList.add(443.2);
    demoList.add(44.2);
    demoList.remove(5);
    double smallest = demoList.get(0);
    for (double i : demoList) {
      if (smallest > i) {
        smallest = i;
      } else {
        continue;
      }
    }
    System.out.println("The smallest value in the ArrayList was: " + smallest);
  }
}
