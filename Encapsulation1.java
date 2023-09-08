class Student
{
 private int age;
   private String name;

   public void show2(){
    age=12;
    name="PRASHANT KUMAR";
   }
  public void show()
  {
  System.out.println(age+" "+name);
  }
}
public class Encapsulation1 
{
    public static void main(String[] args) 
    {
        Student obj=new Student();
        obj.show2();
       // obj.show();//if call the function ,write down the method is private ,the show the error in 21 and 22 row
        //obj.age=18;
        //obj.name="PRASHANT KUMAR";
        obj.show();

    }
}
         