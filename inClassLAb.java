import java.util.Scanner;

public class inClassLAb {
  public static void main (String[] args) {
   Scanner keyboard = new Scanner(System.in);
   
     System.out.print("What is your name");
      String name = keyboard.nextLine();
      
     int x = name.length();
     
     System.out.println("Your name is " + x + " letters long");
  char first = name.charAt(0);
  char last = name.charAt(name.length() - 1); 
     
  System.out.println("first letter is " + first+ " and the last letter is " + last);
   
   System.out.print("Enter your moms name");
      String momName = keyboard.nextLine();
   
     
      if (name.compareTo(momName)<0) 
          System.out.println("you name is longer");
      else 
          System.out.println("mom name is longer"); 
      
     
  
  }
}
      
      