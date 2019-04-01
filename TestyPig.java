import java.util.Scanner;

public class TestyPig {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int counter = 0;
    int sum=0;
    int num;
    
    System.out.println("Enter numbers to get a sum, enter -1 when you are done");
    num = in.nextInt();
    
    while (num != -1) {
      counter++;
        sum+= num;
      System.out.println("enter a number or -1 to exit");
      num= in.nextInt();
      
    }
    System.out.println("the sum of your numbers is" + sum + "you entered" + counter+ "numbers");
  }
}
      
     