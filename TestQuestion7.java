import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections; 
public class TestQuestion7 {
  
  public static void main(String[] args)   {
    Scanner keyboard = new Scanner (System.in);
    
    System.out.println("Enter a value for k");
    int k = keyboard.nextInt();
  
      int arr[] = new int[100];
      int x[] = new int [100];
      int n =6;
      
    System.out.println("enter a value for n");
                       
    readdata(k,arr);
    count5s(n,arr);
    sortarray(arr,n);
    
  }
  public static void readdata(int k, int arr[]) {
    Scanner keyboard = new Scanner (System.in);
    int n= k;
    System.out.println("Enter " +k+ " values for the array");
    for (int i=0; i <k; i++) {
      arr[i]= keyboard.nextInt();
      System.out.println(i + ":" + arr[i]);
}
  }
    public static void count5s(int n, int arr[]) {
      int counter1=0;
      int counter2=0;
      int counter3=0;
      for (int i = 0; i < n; i++) {
        if (arr[i] > 5) 
          counter1++;
        else if  (arr[i] < 5)
          counter2++;
        else if (arr[i] == 5)
          counter3++;
      }
      System.out.println("nums grater than 5 > " +counter1);
      System.out.println("nums grater than 5 < " +counter2);
      System.out.println("nums grater than 5 = " +counter3);
    
  }
    public static void sortarray(int arr[], int n) {
   // Arrays.sort(arr, Collections.reverseOrder());
    System.out.println(Arrays.toString(arr));
}
      
      
}

  