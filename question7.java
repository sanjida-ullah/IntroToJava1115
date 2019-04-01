import java.util.Arrays;
import java.util.Scanner;
public class question7 {
  public static void main(String[] args){
   
    
    int[] k = new int[100];
    int n = 6;
    
    readdata(n, k);
    System.out.println(Arrays.toString(k));
    
    count5s(n, k);
    sortarray(k, n);
    System.out.println(Arrays.toString(k));
  }
  
  public static void readdata(int n, int[] arr){
    Scanner input = new Scanner(System.in);
    for(int i=0; i<n; i++){
      System.out.print("Please enter the numbers : ");
      arr[i]=input.nextInt();
      System.out.println("You entered: " + arr[i]);
    }
  }
  public static void count5s(int n, int[] v){
    int countGreater=0, countLess=0, countEqual=0;
  for(int i=0; i<n; i++){
    if (v[i]>5)
      countGreater++;
    else if(v[i]<5)
      countLess++;
    else
      countEqual++;
  }
  System.out.println(" The numbers of element greater then 5 in V array are : " + countGreater);
  System.out.println(" The numbers of element less then 5 in V array are : " + countLess);
  System.out.println(" The numbers of element  that is equal to 5 in V array are : " + countEqual);  
}
  public static void sortarray(int[] w, int n){
    for(int i=0; i<n; i++){
      int biggest =i;
      for(int j=i+1; j<n; j++)
        if (w[biggest]<w[j]){
        biggest=j;
      }
      int num=w[i];
      w[i]=w[biggest];
      w[biggest]=num; 
      System.out.print(num);
    }
  }   
}