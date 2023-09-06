 class Demo1 {

static int a;
static int b;

int m;
int n;

static
{
    a=3;
    b=5;
    System.out.println("Static variable block");
}

{
    m=100;
    n=200;
    System.out.println("control in non static block or instance block");

}
static void disp1()
{
     System.out.println("Value of static variable"+a);
      System.out.println("Value of static variable"+b);
}
void disp2()
{
     System.out.println("Value of non static variable"+m);
      System.out.println("Value of non static variable"+n);
}
}
public class MoreOnStatic{

    public static void main(String[] args) {
        
        Demo1 d=new Demo1();
        d.disp1();
        d.disp2();
    }

}