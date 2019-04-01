/** Javadoc:
  * Read in two numbers, and print the larger of the 2 numbers. 
  * For example, user enters 5 and 10, the program will print: 
  * You entered 5 and 10.
  * The max value is 10. 
  * If the two numbers are equal, print: 
  * Both numbers are equal 
 */ 

import java.util.Scanner;

public class InClassLab4 {

  public static void main(String[] args)   {
 
        Scanner readObject = new Scanner(System.in);
        
        double FirstNumber, SecondNumber;
          
          System.out.print("Enter first number "); //prompt the user to enter First number 
      FirstNumber = readObject.nextDouble();  // 
       System.out.print("Enter second number "); //prompt the user to enter second number 
       SecondNumber = readObject.nextDouble();
      System.out.println("You entered " + FirstNumber + "," + SecondNumber+ ".");
       if (FirstNumber > SecondNumber) 
          System.out.println ("The max value is " +FirstNumber);
       if (SecondNumber > FirstNumber)
         System.out.println("The max value is " + SecondNumber);
         
         if (FirstNumber == SecondNumber) 
         System.out.println("Both numbers are equal");
         
  }
}
            
          