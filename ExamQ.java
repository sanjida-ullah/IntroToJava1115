import java.util.Scanner;
  
  public class ExamQ {
  
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    
    double sideA, sideB;
      
    System.out.println("Enter length of side A");
    sideA = input.nextDouble();
    System.out.println("Enter length of side B");
    sideB = input.nextDouble();
    
    double hypot = Math.sqrt((Math.pow(sideA,2)) + (Math.pow(sideB,2)));
    double area = ((.5 * (sideA *sideB)));
    System.out.println("The value you entered for side A "
                         + "is: " + sideA + " and the value"
                         + " entered for side B is " + sideB);
    System.out.println("The area of the triangle is " + area);
    System.out.println("The hypotenuse of the tirangle is "
                         + hypot);
    
    /* The variables in this pgm are sideA, sideB, input, arg, out
     * 
      */
    
    
    
  }
}