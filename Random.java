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


import java.util.*;

public class Random{
// Scanner for the console inputs

static Scanner console = new Scanner (System.in);

public static void main(String[] args) {

    String name;
    double paintPrice, wallSpace, gallonsNeeded, hoursLaborReq, totalPaintCost, laborCharge, totalJobCost;

 // Prints the welcome message from the method.
    welcomeMessage();

 // Every initialized variable receives the return statements from their respected methods.        
    name  = getName();
    paintPrice = getPaintPrice ();
    wallSpace = getwallSpace ();
    gallonsNeeded = (wallSpace/100);

 // Formats the net pay to be 2 decimals.   
    System.out.println("Welcome" +name + "gallons of paint needed is" + gallonsNeeded + " \n");}

// Method for the welcome message, a void because it returns no values.

static void welcomeMessage ()
{
    System.out.println("Welcome to the CIS paint shop\n");
}

// Method that prompts the user to enter their name, scans it, then returns it.
static String getName ()
{
    String name;
    System.out.println("Please enter your name ");
    name = console.nextLine();
    return name;

}

//Method that prompts the user to enter their pay rate, scans it, then returns it.    
static double hoursLabor()
{
    double hoursLaborReq;
    System.out.println("Please enter the hours of labor required ");
    hoursLaborReq = console.nextDouble();
    console.nextLine();
    return hoursLaborReq;
}

//Method that prompts the user to enter their hours worked, scans it, then returns it.        
static double totalPaintCost()
{
    double totalPaintCost;
    System.out.println("Please enter total paint cost");
    totalPaintCost = console.nextDouble();
    console.nextLine();
    return totalPaintCost;
}
/**
//Method that uses the pay rate, hours worked that the user has entered.
//determines if the user qualifies for overtime pay or not, then calculates the overall    pay
//followed by tax reduction, then returns the netpay value.
static double laborCharge, totalJobCost;
{
   double paintPrice, wallSpace, gallonsNeeded, hoursLaborReq, totalPaintCost, laborCharge, totalJobCost;
   String formatGallons;

    if(hours > 40)
    {
        grossPay = (pay * hours) * 1.5;
    }
    else
    {
        grossPay = pay * hours;
    }
    net = grossPay - (grossPay * .15);
    return net;
    */
}

System.out.println("Enter the price of the paint");
        paintPrice = readPaintPrice();
        System.out.println("Enter the sq ft of wall to be painted";
        wallSpace =readWallSpace();
        System.out.println("The sq ft to be painted is" + wallSpace);
        double gallons needed
        System.out.println("The area of your room in feet is: " + area);
        int pricePerSqFt=15; //this has to be changed to a method call
         //int price = calculatePrice(area.pricePerSqft);
        int price=calculatePrice(area, priceP


