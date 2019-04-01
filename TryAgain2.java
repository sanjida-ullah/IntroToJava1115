import java.io.*;
import java.util.Scanner;

public class TryAgain2 {
  
  public static void main(String[] args) {
    
    String sentence = "Broccoli is delicious."; 
    int start = sentence.indexOf(" ") + 1;
    int end = sentence.indexOf(" ", start+1);
    String secondWord = sentence.substring(start,end);
    
    System.out.println(secondWord);
  }
  
}







