import java.util.Scanner;

/** class Orders processes online orders */
public class Orders {
 
  /** main method calls methods to read in data and calculate price
   */
  
  public static void main(String[] args)   {
    
    System.out.print("How many orders are we processing?");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    // allocate our arrays based on n
    int[] qty = new int[n];
    double[] price = new double[n];
    double[] totalPrice = new double[n];
    // 2 method calls
    readData(qty, price, in);
    displayArrays(qty, price);
    calculateTotals(qty, price, totalPrice);
    displayArrays(qty, totalPrice);
  }
  /** reads in 2 arrays.
    * @param arr1 int array for first column of data
    * @param arr2 double array for second column
    * */
  public static void readData(int[] arr1, double[] arr2, Scanner input)
  {    
    for (int i=0; i<arr1.length; i++) {
      System.out.print("Enter quantity as integer, and price as double: ");
      arr1[i] = input.nextInt();
      arr2[i] = input.nextDouble();
    }
  }
  
  public static void displayArrays(int[] arr1, double[] arr2)
  {
    for (int i=0; i<arr1.length; i++)
        System.out.printf("%6d  %6.2f\n", arr1[i], arr2[i]);
  }
  public static void calculateTotals(int[] qty, double[] price, double[] totalPrice)
  {
    for (int i=0; i<arr1.length; i++) {
    double totalPrice = int qty * double price
    System.out.println("The total price is " + totalPrice);
}

  /* Lab assignment: write a method to fill up the totalPrice array */
  
}
}