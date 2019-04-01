// 11/1/2017

import java.io.*;

public class OutputFiles1 {
  /**This class demonstrates output files in java
   */
  public static void main(String[] args) throws IOException  {
    
    /** uses a for loop to write numbers to a file. */
    PrintWriter ofile = new PrintWriter("out.txt");
    ofile.println("hello world!");
    for (int i=1; i<=100; i++) {
      ofile.print(i+" ");
      if (i%10==0)
         ofile.println();
    }
    ofile.close();
    /** what if I want to append to the end of the file? 
    There is an additional step. 
    Create another object of type FileWriter to represent the file */
    FileWriter fwriter = new FileWriter("out.txt", true);
    PrintWriter ofile2 = new PrintWriter(fwriter);
    ofile2.println("This is the APPENDED data. It should come after "
                     + "all those lines of numbers.");
    ofile2.close();
    /* Suppose I worry to simply open a file for output since it
     * may erase an existing file.
     * 1 possible solution: open for appending.
     * 2nd solution: check if file exists */
     
      
  }
}