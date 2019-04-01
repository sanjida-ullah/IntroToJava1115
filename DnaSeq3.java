/* This pgm will determine allow you to input a sequence via text file
 * The program will then change the text to upper case
 * Next the program will determine the validity of the entered sequence
 * The pgm will allow you to search for motifs
 * The pgm will count the number of occurances of the motif 
 * The pgm will also tell you the number of tandem repeats 
 * */

import java.io.*;
import java.util.Scanner;

public class DnaSeq3 {
  
  public static void main(String[] args) throws IOException  {
    
    String test = " ";
    String test1 = readDNA("Tandem.txt", test);
    
    String upper = test1.toUpperCase();
    
    System.out.println(upper);
    System.out.println(isValidDNA(upper));
    
    String pattern;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter motif to search");
    pattern = in.nextLine();
    
    System.out.println(numTandem(pattern, upper));
           
  }
  // This method will read in the DNA sequence from a text file
  public static String readDNA(String file, String dnaSeq) throws IOException {
    
    File myfile = new File(file); 
    
    Scanner infile = new Scanner(myfile);
    
    while(infile.hasNextLine())
    {
      dnaSeq += infile.nextLine();
    }
    return dnaSeq;
  }
  // This method will determine the validity of the entered DNA seq
  // Will return true if DNA seq is valid
  public static boolean isValidDNA(String upper) {
    
    for (int i =1; i < upper.length(); i++) {
      
      if ( (upper.charAt(i) !='A' && upper.charAt(i) !='G' && upper.charAt(i) !='C' && upper.charAt(i) !='T')) {
        return false;

      
    }
  
    }
  return true;}
  
  // This method will count the number of times a motif occurs
  public static int numTandem (String pattern, String upper) {

   int motif= 0;
    int loc = upper.indexOf(pattern);
    while (loc!=-1) {
      motif ++;
      loc = upper.indexOf(pattern, loc+1);
  }
    if (motif<= 0)
      System.out.println("This motif does not occur in this particular DNA sequence");
    else {
      System.out.println(" This motif occurs " +motif+ " times");
    }
    {
    int tandem=0;
    int loc2 = upper.indexOf(pattern.concat(pattern)); 
      while (loc2!= -1) { 
      loc2= upper.indexOf((pattern.concat(pattern)) , loc2+1);
      tandem++;
}
      if (tandem<= 0)
      System.out.println("This motif does not occur in tandem repeat");
    else {
      System.out.println(" This tandem repeat occurs " + (tandem +1) + " times");
    }
  return tandem;}
  }
}






