/* Lab 6:
 * Write 2 void methods. One is called first and the other is 
 * called second. 
 * Call the 'first' method from main
 * Call the 'second' method from first.
 * Each method should print some kind of message.
 */

public class Newlab{

  public static void main(String[] args)   {
    System.out.println("The temperatuer outside is");
    celcius();
    System.out.println("I am here.");
  
  }

  public static void celcius()   {
    System.out.println("Look at me Im on Mars!");
    faranhite();
  }
 
  public static void faranhite()   {
    System.out.println("Now im on Pluto");
  }
}

