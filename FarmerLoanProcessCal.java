 import java.util.Scanner;
 class Farmer
{
    int pa;
    float td;
    float ri;
    float si;

    void input()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Mention the required  amount");
         pa=sc.nextInt();
         System.out.println("Mention  the time duration");
         td=sc.nextFloat();
         ri=9.5f;
    }
    void compute()
    {
        si=(pa*ri*td)/100;
    }
    void disp()
    {
        System.out.println("SI is: "+si);
    }
}
public class FarmerLoanProcessCal {
    public static void main(String[] args) {
       Farmer f1=new Farmer();
       f1.input();
       f1.compute();
       f1.disp(); 
       Farmer f2=new Farmer();
       f2.input();
       f2.compute();
       f2.disp();
    }
}
