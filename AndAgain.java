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

public class AndAgain {
  
  public static void main(String[] args)   {
    
    double paintPrice, wallSpace, gallons, hours;
    double totalPaintCost, laborCharge, totalJobCost;
    
    welcomeMessage(); 
    System.out.println("The price of paint is " + pP() + ".");
    System.out.println("We will need " + g() + " gallons"
                        + " of paint for the job");
    System.out.println("Hours required for this job "
                        + "is " + h() + ".");
    System.out.println("The total paint cost"
                        + " is " + tPC() + ".");
    System.out.println("The total labor charge"
                        + " is" + lC() + ".");
    System.out.println("The total cost of this job"
                         + " will be" + tJC() + ".");
  }
  public static void welcomeMessage() {
    
    System.out.println("Welcome to the CIS paint shop.");
  }
   public static double pP()   {
        double paintPrice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of paint"
                             + "per gallon");
        paintPrice = input.nextDouble();
        return paintPrice;
   }
    public static double wS()   {
        double wallSpace;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sq ft of wall to"
                             + "be painted");
        wallSpace = input.nextDouble();
        return wallSpace;
   }
    public static double g()   {
        double gallons;
        gallons = (wS() /100);
        return gallons;
    }
    public static double h()   {
        double hours;
        hours = (g() * 8 );
        return hours;
    }
    public static double tPC() {
      double totalPaintCost;
      totalPaintCost= (g() * pP());
     return totalPaintCost;
    }
     public static double lC() {
      double laborCharge;
      laborCharge= (h() * 25);
     return laborCharge;
    }
     public static double tJC() {
      double totalJobCost;
      totalJobCost= (lC() + tPC());
     return totalJobCost;
    }
           
   }

