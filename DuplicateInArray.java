public class DuplicateInArray {
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,4,6};
    int n=arr.length;

    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
            }
        }//time complexity=O(n^2)
    }
   } 
}
