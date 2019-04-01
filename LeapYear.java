//if stmt if a year is a leap year or not

import java.util.Scanner;
public class LeapYear {
  public static void main (String[] args) {
  int year;
  System.out.print("Enter a year to determine if it is a leap year ");
    Scanner input= new Scanner (System.in);
    boolean leapYear;
    year = input.nextInt ();
         System.out.println("The year you entered is" + year);
         leapYear = (year/ 400);
           leapYear = false; 
         System.out.println("It is a leap year.");
       }

       }

