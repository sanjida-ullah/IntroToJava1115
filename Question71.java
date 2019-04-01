import java.util.Scanner;

public class Question71 {
  public static void main (String [] args) {
    
    Scanner data = new Scanner(System.in);
    
    System.out.println("Type in an integer below: ");
    
    int k = data.nextInt(); 
    
    int[] x = new int [100];
    
    // read in data
    readdata(k,x);
    
    count5s(k, x);
    
    sortarray(x,k);
    for(int i = 0; i < k; i++) {
      System.out.println(x[i]);
    }
     
    
  }
  
  public static void readdata(int n, int [] arr) {
    Scanner sc = new Scanner(System.in);
    
    for(int i =0; i < n; i++) {
      System.out.print("Enter val: ");
      arr [i] = sc.nextInt();
      System.out.println(arr[i]);
    }
  }
  
  // count5s
  public static void count5s(int n, int[] v) {
    int great=0, less=0, same=0;
    
    for (int i = 0; i < n; i++) {
      if (v[i] > 5) {
        great++;
      }
      else if (v[i] == 5) {
        same++;
      }
      else {
        less++;
      }
    }
    System.out.printf("Greater: %d\nSmaller: %d\nSame: %d\n", great, less, same);
  }
  
  public static void sortarray(int[] w, int n) {
    int temp = 0;
    for(int i= 0; i< n; i++) {
      for(int j =0; j<n-1; j++) {
        if(w[j] < w[j+1]) {
          temp = w[j];
          w[j] = w[j+1];
          w[j+1] = temp;
        }
      }
    }
  }
}