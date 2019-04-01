/* lab assignment
 * write a method that accepts 2 String objects as parameters
 * The first is a pattern to search for , the second is a test to search.
 * the methood returns the number of times the pattern occurs in the text.
 */

import java.util.Scanner;

public class SecondToLastLab {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a squence to search");
     String pattern = in.nextLine();
    System.out.print("Eter the sequence to search from");
    String text = in.nextLine();
    int loc=0
      ;
    
   findStuff(pattern, text, loc);

  }
    public static void findStuff(String pattern, String text, int loc) {
    
    // search for a pattern in a text
      
      pattern = "tag";
      text = "tcaTAGtctcaatatataccattcaaatacgatacgtatgggttgccaaaTAGaga";
    loc = text.indexOf(pattern);
      while (loc!=-1) {
             System.out.println(pattern + " occurs at location " + loc);
             loc = text.indexOf(pattern, loc+1);
      }
  }
}