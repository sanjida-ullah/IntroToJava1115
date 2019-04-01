/* This program process a list of address for delivering packages 
 * It will sort the addresses depending on if it begins with 112 or not */
import java.io.*;
import java.util.Scanner;

public class OutPutFiles {

  public static void main(String[] args) throws IOException  {
    File myfile = new File("mydata.txt");
    Scanner infile = new Scanner(myfile);
    PrintWriter newList1 = new PrintWriter("AddList1.txt");
    PrintWriter newList2 = new PrintWriter("AddList2.txt");
    

    
    boolean twoTypesOfAdd;
      String street;
      int counter1=0, counter2 = 0, houseNum, zip;
      
      while(infile.hasNextInt()) {
        houseNum= infile.nextInt();
        street = infile.nextLine();
        zip= infile.nextInt();
        
        twoTypesOfAdd = whatisZip(zip);
        if(twoTypesOfAdd == true) {
          newList1.print(houseNum + street + zip + "\n");
          counter1++;        
        }
          else { 
            newList2.print(houseNum + street + zip + "\n");
            counter2++;  
          }
        }
        System.out.println("Zipcodes begining with 112 is " + counter1 + ".");
        System.out.println("Zipcodes NOT begining with 112 is " + counter2 + ".");
        newList1.close();
        newList2.close();    
  }
      public static boolean whatisZip(int zip){
        if(zip >= 11200 && zip < 11300) {
          return true;
        }
        else {
          return false; 
        }
      }
}

