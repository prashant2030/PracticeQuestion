public class EnancedForLoop {
   public static void main(String[] args) {
    int nums[][]={{1,2,3},
              {4,5,6},
              {7,8,9}};
       
       for(int a[]:nums){
        for(int b:a){
            System.out.print(b+ " ");
        }
        System.out.println();
       }
   } 

}
