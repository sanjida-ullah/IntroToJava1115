import java.io.*;
import java.util.Scanner;

public class TestQ5 {
  
  public static void main(String[] args) throws IOException  {
    File myfile = new File ("input55.txt");
    Scanner infile = new Scanner (myfile);
    PrintWriter ofile = new PrintWriter("NewDoc2.txt");
    double quotient=0;
    int counter=0;
    
    int num1 = infile.nextInt();
    int num2 = infile.nextInt();
    int sum  = num1 + num2;
    
    if (sum>0) 
      quotient = ((double) (num1) / (double) ( num2));
    else 
      quotient= (((double) (num2)) / ((double) (num1)));
    
    double closest = quotient;
    counter++;
    
    
    while (infile.hasNext()) {
      counter++;
      num1 = infile.nextInt();
      num2 = infile.nextInt();
      sum = num1 + num2;
      
      if (sum>0) 
        quotient = ((double) (num1) / (double) ( num2));
      else 
        quotient= (((double) (num2)) / ((double) (num1)));
      ofile.printf("num1 is: %d num2 is : %d quotient is: %.2f\n", num1, num2, quotient);
      
      closest = Math.abs(quotient) < Math.abs(closest) ? quotient : closest;
    }
    System.out.println("number of pairs processed is " +counter + "\nAnd closest is: " + closest);
    
    ofile.close();
    infile.close();
  }
}

