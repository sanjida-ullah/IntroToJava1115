/* Lab asignment:
 * Review: counting with while loop
 * Review: writing methods
 * Write a method that uses the while loop. The method should 
 * read in a number from the keyboard.
 * The method will count how many numbers < this limit are divisible by 5. 
 * The method should return this number.
 * Pseudocode for method:
 * 1. Read in a number
 * 2. initialize divisor to 5 
 * 3. while(divisor < number)
 *       increment counter 
 *       add 5 to divisor
 * 4. return counter
 * 
 */
 import java.util.Scanner;

public class LabAssignment9 {

  public static void main(String[] args)   {
    Scanner in = new Scanner(System.in);
    int number = 0, counter = 0;
    System.out.print("Enter a number");
    number = in.nextInt();
    while(number/ 5) { 
        counter++;
      
        System.out.println("The number you entered is " + number);
        System.out.println("The counter is"  + counter);

     
    
    
    
  }
}
}