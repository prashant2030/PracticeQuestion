public class StringNewKeyword {
    public static void main(String[] args) {
        String s1="brand";
        String s2="brand";
        String s3=new String("brand1");
        String s4= new String("brand1");
        System.out.println(s1==s2);//String ref '=='
        System.out.println(s3==s4);
    }
}
