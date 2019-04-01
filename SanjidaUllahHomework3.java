//Sanjida Ullah 10.02.2017
//Homework number 3 Phone plan

import java.util.Scanner;

public class SanjidaUllahHomework3 {
  
  public static void main(String[] args)   {
    
       double Option, Text, Mins;
       
       System.out.print("Enter which number phone plan you have.");
       Scanner input = new Scanner(System.in);
       Option = input.nextInt();
       if (Option ==1 ) {
         System.out.println("Phone plan option 1 allows for Unlimited" 
                            + "Calling and Texting. \n Price:" 
                              + " $89.00 per month.");
       }
       else if (Option ==2 ) {
         System.out.println(" Phone plan option 2 allows for Unlimited Calling" 
                            + " and pay per text. \n Base Price: $79.00 per"
                              + " month plus 5 cents per text.");
       System.out.print("Enter number of texts sent");
       Text = input.nextInt();
       System.out.print("Bill price is: $" + (79+(Text*.05)));
       }
       else { //Option ==3; 
         System.out.println(" Phone plan option 3 has a $35.00 base price for"
                              + " up to 50 minutes, and then 3 cents per minute."
                              +"\n This option does not allow texting.");
       System.out.print("Enter number minutes used");
       Mins = input.nextInt();
         if (Mins <50) {
         System.out.println("Bill price is: $35.");
       }   
       else
       {  
       if (Mins > 50);
         System.out.println("You have exceeded the 50 minutes allowed"
                              + " with your plan. \nRate of $ 0.03 will be"
                              + " implemented for each additional minute.");
         System.out.println("Bill price is: $" + (35+((Mins-50)*.03 )));
         
       }
       }
                 
    }
}