/** first question on sample exam 1
  * for a right trianggle
  * */
  import java.util.Scanner;
  public class RightTriangle {
    /** this class calculates area and hypotnuse for a right triangle
      */
    public static void main (String[] args) {
      double side1, side2;
      // (a)
      System.out.print("Enter two shorter sides of a right triangle: ");
    Scanner input= new Scanner (System.in);
    side1 = input.nextDouble ();
    side2 = input.nextDouble ();
    
// (b)
    double area = (side1*side2)/2;
     // double area = 1/2 * side1 * side 2 (this would be bad because integer division will give you zero) also need parentheses 
    System.out.println("Area of triangle is: " + area);
   
  
      // (c)
    double hypotenus = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
      System.out.println("Hypotenuse of triangle is: " + hypotenus);
      double d; 
      d = getDouble("Please enter a number (can be a double) : ", input);
      System.out.println("in main, returned from a method, d has value:" + d);
      //(d) if area is larger than 6, print msg, otherwise . . .
   /*   if (area>6)
      System.out.print("YOur triangle is larger than 6");
      else
        System.out.print(
    }
    
  // side 1 & side 2 , area, hypotenuse = variables) input is an object 
  
  /** Answer to question 3 on sample exam 1  */
   public static double getDouble(String prompt, Scanner in)    {
    System.out.println(prompt); 
    double number;
    number = in.nextDouble();
    return number;
    }
    
  }
  //  side1= getDouble("Enter a double for the first side", input);
  //    side2= // can use these get doubles instead of ^ ans to pt 4 