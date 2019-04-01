import java.util.Scanner;

public class Game {
  /**  This is a simple guessing game.
    *  We will generate a number between 0 and 100
    *  Your job will be to guess the number.
    * We will let you know if you should guess higher or lower. 
    */
  public static void main (String[] args) {
    System.out.println("Hello Gamer! I will think of a number "
                         + "between 0 and 100 your job is to " 
                         + "guess the number. \n I will let you "
                      + "know if you should guess higher or lower");
    
       int rdmNum = (int) (Math.random() *101); 
       int counter = 0;
       int guessNum = 0;
       Scanner in = new Scanner(System.in);
     while (guessNum != rdmNum) { 
      System.out.println("Enter a guess:");
      guessNum = in.nextInt();
      counter++;
     if ( guessNum < rdmNum) {
      System.out.println("Nope! My number is higher than " + guessNum);
   } else if ( guessNum > rdmNum) {
      System.out.println("Nope! My number is lower than " + guessNum);
   } else if (guessNum == rdmNum) {
      System.out.println("HOORAY! You guessed right!!");       
  }
  }
      System.out.println("It took you " + counter + " guess to get"
                           + "the right number.");
  }
}

        
      