public class EqualMethodInString {
    public static void main(String[] args) {
        String s1="brand";
        String s2=new String("brand");

        System.out.println(s1==s2);
        System.out.println((s1).equals(s2));
    }
}
