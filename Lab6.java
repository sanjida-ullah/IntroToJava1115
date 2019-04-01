/* Lab 6:
 * Write 2 void methods. One is called first and the other is 
 * called second. 
 * Call the 'first' method from main
 * Call the 'second' method from first.
 * Each method should print some kind of message.
 */

public class Lab6{

  public static void main(String[] args)   {
    System.out.println("Hello people");
    first();
    System.out.println("I am here.");
  
  }

  public static void first()   {
    System.out.println("Look at me Im on Mars!");
    second();
  }
 
  public static void second()   {
    System.out.println("Now im on Pluto");
  }
}
