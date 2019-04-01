/**You are writing a program for a Painting Company to provide an estimate for a job.
The company has determined that one gallon of paint and 8 hours of labor are
necessary for every 100 square feet of wall space. The price for labor is $25.00 per
hour.
Your program should begin by calling a void method that displays a welcome message
to the screen.
Your program should then read in two input values:
1. Price per gallon of paint
2. The number of square feet of wall space to be painted.
Your program should then call methods to calculate the following:
1. The number of gallons of paint required
2. The hours of labor required
3. The cost of the paint
4. The labor charges
5. The total cost of the paint job
Finally, all of the data should be displayed to the screen.
Important: Notice that the values returned from earlier methods will be used as
parameters for other methods.
You will be writing at least 7 methods (including main) but you may decide to write
more. Each method will be short. 
*/

import java.util.Scanner;

public class Practice {
  
  public static void main(String[] args)   {
    
    double paintPrice, wallSpace, gallons, hours, totalPaintCost, laborCharge, totalJobCost;
    welcomeMessage(); 
    pP();
    wS();
    g();
    print();
        
  }
  public static void welcomeMessage() {
    
    System.out.println("Welcome to the CIS paint shop.");
  }
  
  public static double pP() {
    double paintPrice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of paint per gallon");
        paintPrice = input.nextDouble();
        return paintPrice;
}
  public static double wS() {
       double wallSpace;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sq ft of wall to be painted");
        wallSpace = input.nextDouble();
        return wallSpace;
  }
   public static double g() {
       double gallons;
       gallons = ( wS() / 100);
       return gallons;
   }
   public static void print() {
      System.out.println("The price of paint is " + pP() + " per gallon."
                               + " The sq ft of wall to be covered is " + wS() + "."
                               + " Thus we will need " + g() + " gallons of paint.");
          System.out.println("Hours of labor required is " + g() * 8 + "hours.");
   }
        
  
  
 /**  public static double gallonsPaintNeeded()   {
       double paintPrice, wallSpace;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of paint per gallon");
        paintPrice = input.nextDouble();
        System.out.println("Enter the sq ft of wall to be painted");
        wallSpace = input.nextDouble();
        double gallons = (wallSpace/100);
          System.out.println("The price of paint is " + paintPrice + " per gallon."
                               + " The sq ft of wall to be covered is " + wallSpace + "."
                               + " Thus we will need " + gallons + " gallons of paint.");
          System.out.println("Hours of labor required is " + gallons * 8 + "hours.");
          return gallons; */
}
   
    
   
                        
