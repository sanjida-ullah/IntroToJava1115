// 11/1/2017
// Read in from a file by creating a File object and wrapping it in
// a Scanner object.
// We can then use all the methods of the Scanner class to read.
// We use hasNext() to detect end of file.
// read in filename -- use a String object
// what if it is not in current directory -- supply the correct pathname

import java.io.*;
import java.util.Scanner;

public class InputFiles {
  /**This class demonstrates output files in java
   */
  public static void main(String[] args) throws IOException  {
    
    File myfile = new File("mydata.txt");
    Scanner infile = new Scanner(myfile);
    String lineOftxt = infile.nextLine();
    System.out.println(lineOftxt);
    double num=infile.nextDouble();
    int i = infile.nextInt();
    System.out.println("num is: " + num + " i is: " + i);
    infile.close();   
 
    }
    
    Scanner infile2 = new Scanner(myfile2);
    int number;
    /***
    for (int j=0; j<10; j++) {
      number = infile2.nextInt();
      System.out.println("j: " + j +" number: " + number);
    }
    ***/
    // read as many numbers as appear in the file "until end of input"
    // count how many numbers were read in
    int counter=0;
    // hasNext method returns a boolean
    while (infile2.hasNext()) {
        counter++;
        number = infile2.nextInt();
        System.out.println(counter + ": number: " + number);
        
    }
    System.out.println(counter + " numbers were read in.");
    infile2.close();
    
    /* Allow user to enter name of file */
    String filename;
    System.out.print("What is the name of your input file? ");
    Scanner keyboard = new Scanner(System.in);
    filename = keyboard.nextLine();
    System.out.println("We will open file " + filename);
    
    File myfile3 = new File(filename);
    Scanner infile3 = new Scanner(myfile3);
    
    while (infile3.hasNext()) {
        counter++;
        number = infile3.nextInt();
        System.out.println(counter + ": number: " + number);
    }
    // using same counter as previous loop
    System.out.println(counter + " numbers were read in.");
    infile3.close();
    
    
    
  }
}