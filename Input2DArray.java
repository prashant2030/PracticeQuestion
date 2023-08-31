import java.util.Scanner;
import java.util.*;
public class Input2DArray {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of row");
    int m=sc.nextInt();

    System.out.println("Enter the column number");
    int n=sc.nextInt();

    System.out.println("Enter the array elements");
    int arr[][]=new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            arr[i][j]=sc.nextInt();
        }
        
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
         System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    
   


   } 
}
