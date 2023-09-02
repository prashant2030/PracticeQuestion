public class StringTypesRelated {
   public static void main(String[] args) {
    //immutable string
    String brand="NIT";
    System.out.println(brand);
    brand.concat("Hamirpur");
    System.out.println(brand);
    //mutable string
    StringBuilder brand1=new StringBuilder("NIT"+" ");
    System.out.println(brand1);
    brand1.append("Hamirpur");
    System.out.println(brand1);
   } 
}
