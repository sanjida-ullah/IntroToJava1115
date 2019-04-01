/* Pgm to determin DNA Seq info */

import java.io.*;
import java.util.Scanner;

public class DnaSeq2 {
  
  public static void main(String[] args) throws IOException  {
   
    String test = " ";
    String test1 = readDNA("Fasta.txt", test);
    
    String upper = test1.toUpperCase();
    
    System.out.println(upper);
    
     String pattern = "ATG";
    System.out.println(isValidDNA(upper));
    
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
    for (int i = 0; i < upper.length(); i++) {
        if (upper.contains("A")) {
        } else {
            if (upper.contains("G")) {
        
            } else {
                if (upper.contains("C")) {
                   
                } else {
                    if (upper.contains("T")) {
                       
                    }
                }
}


        }
    }
    return false;}
    else{
      return true;
}
}



