/* Pgm to determin DNA Seq info */
import java.io.*;
import java.util.Scanner;

public class Homework8{
  
  public static void main(String[] args) throws IOException  {
   
    String dnaSeq; 
    
    readDNA(dnaSeq);
    
  }
  public static String readDNA(String dnaSeq) throws IOException {

    File myfile = new File("Fasta.txt"); 
    
    Scanner infile = new Scanner(myfile);
    
    while(infile.hasNextLine())
    {
    dnaSeq += infile.nextLine();
    }
    System.out.println(dnaSeq);
   
  }
  
    
 }
