// 10/16/2017

/** more ways of using While loop
 */

import java.util.Scanner;

public class CountingnSumming {
  /** This class illustrates how a while loop can count
    * and get a total.
   */
  public static void main(String[] args)   {
    Scanner in = new Scanner(System.in);    
    // counting variable 
    int counter=0, divisor=0;
    // structured read loop
    int num;
    // one read BEFORE enter while loop
    System.out.print("Enter an integer (-1 to exit): ");
    num = in.nextInt();
    while (divisor < num)  {
      counter++;
      divisor+=num;
      // another read at the END of the while loop
      System.out.print("Enter num (-1 to exit): ");
      num = in.nextInt();
    }
    System.out.println("You entered " + counter + " numbers." +
                    " The sum is: " + divisor + ".");
    
  }
}