public class InClassLab6 {

  /* Lab 6:
 * Write 2 void methods. One is called first and the other is 
 * called second. 
 * Call the 'first' method from main
 * Call the 'second' method from first.
 * Each method should print some kind of message.
 */

  public class voidMethod {
  /**
   * main simply will call our method
   */
    
  public static void main(String[] args)   {
    System.out.println("Hello people)");
    firstMsg();
    System.out.println("Im on Earth.");
    
  }
  public static void firstMsg()   {
    System.out.println("Look now im on Mars");
     secondMsg();
  }
  
  public static void secondMsg()   {
    System.out.println("or am I on pluto?!");
  }
      
  }
}
            