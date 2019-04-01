/** Javadoc:
  * Read in coordinates of two points on a graph.
 * Calculate and print:
 * 1. The distance between the 2 points.
 * 2. The slope of the line that runs through the 2 points.
 * 
 *  Use pgming process: understand problem, pseudocode, code, etc.
 *  Use Javadoc comments.
 */ 
import java.util.Scanner;

public class SlopeOfALine {
     /** This program will allow you to enter coordinates for a point on a graph. 
       * It will then calculate the distance between the two points by subtracting (X2- X1), (Y2-Y1).
       * Slope will then be calculated by dividing (Y2-Y1)/ (X2-X1) .
 */ 

  public static void main(String[] args)   {
 
        Scanner readObject = new Scanner(System.in);
    double X1, X2, Y1, Y2;
       
       System.out.print("Enter Point X1"); //prompt the user to enter Coordinate X1
      X1 = readObject.nextDouble();  // 
       System.out.print("Enter Point X2 "); //prompt the user to enter Coordinate X2
       X2 = readObject.nextDouble();
        System.out.print("Enter Point Y1 ");
        Y1 = readObject.nextDouble(); // prompt the user to enter Coordinate Y1
        System.out.print("Enter Point Y2 ");
       Y2 = readObject.nextDouble(); // prompt the user to enter Coordinate Y2
       double DistanceBetweenPointX = X2 -X1 ; // Determine the distance between point X
       double DistanceBetweenPointY = Y2-Y1; // Determine the distance between point Y
       double Slope = (DistanceBetweenPointY / DistanceBetweenPointX);
       System.out.println(" Point A on a coordinate plane is (" + X1 + "," + Y1 + "). Point B on a coordinate plane is (" + X2 + "," + Y2 + ").");
       System.out.println( "The distance between point A and B is (" + DistanceBetweenPointX + ", " + DistanceBetweenPointY+ ").");
       System.out.println("The slope of the line is (" + Slope + ").");
                           
      
       }
}