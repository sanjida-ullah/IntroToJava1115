/*Write a program to test a program that tells you the highest number 
 */ 
import java.util.Scanner;

public class LabOct30 {
  public static void main (String [] args) {
    findMax(1, 2, 3);
    findMax(2, 3, 1);
    findMax(3, 1, 2);
    findMax(3, 2, 1);
    findMax(2, 1, 3);
    findMax(1, 3, 2);
    
    findMax(-3, 3, 1);
    findMax(100, -2, 1000);
  }


  public static int findMax(int num1, int num2, int num3) {
    
    int max = 0;
    if (num1 > num2 && num1 > num3) {
      System.out.println ("The max is " + num1);
      max = num1;
    } else if (num2 > num1 && num2 > num3) {
      System.out.println ("The max is " + num2);
      max = num2;
    } else if (num3 > num1 && num3 > num2 ) {
      System.out.println ("The max is " + num3);
      max = num3;
    }
    
    return max;
  }
}
 
    
    