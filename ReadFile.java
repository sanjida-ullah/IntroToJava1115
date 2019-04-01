// 11/1/2017
// Read in from a file by creating a File object and wrapping it in
// a Scanner object.
// We can then use all the methods of the Scanner class to read.
// We use hasNext() to detect end of file.
// read in filename -- use a String object
// what if it is not in current directory -- supply the correct pathname

import java.io.*;
import java.util.Scanner;


public class ReadFile {
  /**This class demonstrates output files in java
   */
public static void main(String[] args) throws IOException  {
  private Scanner x ;
  public void openFile() {
    try {
      x = new Scanner (new File("mydata.txt"));
    }
    catch (Exception e) {
      System.out.println("could not find file");
    }
  }
  public void readFile() {
    while (x.hasNext()) {
      String a = x.next();
      String b = x.next();
      String c = x.next();
      System.out.printf("%s  %s  %s \n", a,b,c);
      
    }
  }
  public void closeFile() {
    x.close();
  }
}
  