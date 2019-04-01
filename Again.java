
import java.util.Scanner;

public class Again {
  
  public static void main(String[] args)   {
    
 System.out.println(grunf( "Hello" , "Pope" , "Ze"));
 
  }




public static String grunf(String s1, String s2, String s3) {     
          String s = s1.substring(1,2);              
          if (s1.length()>s2.length() && s2.compareTo(s3)<0  && s3.indexOf(s)>0)   
            return s1.substring(0,1) + s2.substring(1) + s;           
          else                    
            return s1.substring(0,1) + s2.substring(0,1) +  s1.substring(0,1);   
          
        }   
}