/*This program will process SAT scores for a set of students using file input and output. 
 * */
import java.io.*;
import java.util.Scanner;

public class SATScores {
  
  public static void main(String[] args) throws IOException  {
    
    int mathScore[]     = new int[20];
    int readingScore[]  = new int[20];
    int totalScores[]   = new int[20];
    boolean maxAreas[]  = new boolean[20];
    
    int n = mathScore.length;
    readSatScores (mathScore, readingScore, n);
    sumScores(mathScore, readingScore, totalScores, n);
    fillMax(mathScore, readingScore, maxAreas, n);
    print4arrays(mathScore, readingScore, totalScores, maxAreas, n);
   
  }
  /** this methood will read the SAT scores from an output file
   * @ param mathScore, is an array contianing SAT math Score
   * @ param ReadingScore, is an array containing SAT Reading score
   * @ pram n is the number of lines read in 
   * */
  
  public static void readSatScores(int[] mathScore, int[] readingScore, int n) throws IOException {
    
    File myfile = new File("SatScores.txt"); 
    
    Scanner infile = new Scanner(myfile);
    for(int i =0; i < n; i++)
    {
      mathScore[i] = infile.nextInt();
      readingScore[i] = infile.nextInt();
    }
  }
  /** this methood will add scores in both sections
   * @ param totalScores, is the combination of reading and math score
    * */
  public static void sumScores(int mathScore[], int readingScore[], int totalScores[], int n) {
    
    for (int i = 0; i < n; i++) {
      totalScores[i] = (mathScore[i] + readingScore[i]); 
    }
  }
  /** this method will determine which section the student did best in
    * @param maxAreas, is the section the student did best in 
    * if they did best in math= true
    * if they did best in reading = false
    * */
  public static void fillMax(int mathScore[], int readingScore[], boolean maxAreas[], int n) {
    for (int i = 0; i < n; i++) {
      if (mathScore[i] > readingScore[i]) {
        maxAreas[i] = true;
      }
      else {
        maxAreas[i] = false;
      }    
    }
  }
  /** this methood will count how many students did best in each section
    * @ param tallyAreas is a counter that will count which section kids did best
    * **/
  public static int tallyAreas(boolean maxAreas[], int n) {
    int studBestInmath = 0; // numer of students best in math
    int studBestInReading = 0; // number of students best in reading
    for (int i = 0; i < n; i++) {
      if (maxAreas[i] == true)
        studBestInmath++;
      else 
        studBestInReading++; 
    }
    return studBestInmath;
  }

      /** this methood will print the arrays into a new output file
        * */
  public static void print4arrays(int mathScore[], int readingScore[], int totalScores[], boolean maxAreas[], int n) throws IOException { 
    // PrintWriter used to writing to file
    PrintWriter ofile = new PrintWriter("output2.txt");
    
    String studBestIn;
    ofile.print("Math Scores    Reading Scores   Total Score   Max Area\n");
    for (int i = 0; i < n; i++) {
      if (maxAreas[i] == true)
        studBestIn = "Math";
      else 
        studBestIn = "Reading";
      ofile.printf("%d %20d %15d %12s  \n" ,mathScore[i], readingScore[i], totalScores[i], studBestIn); 
    }
    
    // close ofile so as to save contents
    ofile.close();
    
    int totMathScore = tallyAreas(maxAreas, n);
    System.out.println(totMathScore + " did best in math.");
    int totReadingScore = (mathScore.length - totMathScore);
    System.out.println(totReadingScore + " did best in reading.");
    
  }
    
  }
  


     
      
      
                      
                          
                   
