import java.util.Scanner;

/**
Sample final
*/
public class Question3PartB
{
  /** Problem: Count # of words that are capital */
   public static void main(String[] args)
   {
      String s="The name is Bond, The JAMES Bond"; 
      int n=3;
      String prefix_n = s.substring(0,n);
      if (s.indexOf(prefix_n,n)!=-1)
         System.out.println("YES");
      else
         System.out.println("NO");
       
      // if (s.indexOf(s.substring(0,n),n))
      int counter=0;
      for (int i=0;i<10;i++) {
           int randomNum = 1 + (int)(Math.random() * 10); 
           System.out.println("i="+i+": " + randomNum);
           if (randomNum>5)
               counter++;
      }// end for
      System.out.println("number of random > 5 is: " + counter);
   }
}