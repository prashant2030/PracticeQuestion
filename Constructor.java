 class Demo{
     private int num;
    private String method;
    Demo(int num,String method){
        this.num=num;
        this.method=method;
    }
   public void show1(){
       System.out.println(num+" "+method);
    }
}
public class Encapsulation2 {
    public static void main(String[] args) {
       //Demo obj=new Demo();
       Demo std=new Demo(12,"Name");
       std.show1(); 
       //remove the private restristion using the new object method 
    }
}
