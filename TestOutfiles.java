import java.io.*;
import java.util.Scanner;

public class TestOutfiles {
  public static void main(String[] args) throws IOException {
    okayNowReadTHis(var1,var2);
    
  }
   public static void okayNowReadTHis(int var1[], int var2[]) throws IOException {
      File myfile = new File("NewFile.txt");
    Scanner infile = new Scanner(myfile);
    
    for(int i = 0; i<var1.length; i++) {
      var1[i] = infile.nextInt();
      var2[i] = infile.nextInt();
      
    }
   
  }
  }

