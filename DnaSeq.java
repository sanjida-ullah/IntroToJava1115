/* Pgm to determin DNA Seq info */

import java.io.*;
import java.util.Scanner;

public class DnaSeq {
  
  public static void main(String[] args) throws IOException  {
    
    String test = " ";
    String test1 = readDNA("Fasta.txt", test);
    
    String upper = test1.toUpperCase();
    
    System.out.println(upper);
    System.out.println(isValidDNA(upper));
    
    String pattern;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter pattern to search");
    pattern = in.nextLine();
    
    System.out.println(numTandem(pattern, upper));
  }
  
  public static String readDNA(String file, String dnaSeq) throws IOException {
    
    File myfile = new File(file); 
    
    Scanner infile = new Scanner(myfile);
    
    while(infile.hasNextLine())
    {
      dnaSeq += infile.nextLine();
    }
    return dnaSeq;
  }
  public static boolean isValidDNA(String upper) {
    Boolean contains = true;
    char arr[] = {'A', 'G','C','T'};
    
    int i = 0;
    
    while (i < upper.length())
    {
      if (upper.charAt(i) != arr[i] && upper.charAt(i) != arr[1] && upper.charAt(i) != arr[2] && upper.charAt(i) != arr[3])
        contains =false;
      i++;
      
    }
    
    return contains;
  }
  public static int numTandem (String pattern, String upper) {
    
    int counter= 0;
    int loc = upper.indexOf(pattern);
    while (loc!=-1) {
      counter ++;
      System.out.println(pattern + " occurs at location " + loc);
      loc = upper.indexOf(pattern, loc+1);
      
    }
    System.out.println(" This pattern occurs " +counter+ " times");
    return counter;}
  
}






