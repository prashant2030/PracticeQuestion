import java.util.Scanner;
public class SumOfDigit {
    public static int sumOfFun(int n){
        int res=0;
        if(n==0){
            return 0;
        }
        else{
            return (n%10)+sumOfFun(n/10);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thre number");
        int n=sc.nextInt();

        int result=sumOfFun(n);
        System.out.println("Sum of digit: "+result);

        }
}
