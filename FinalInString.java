public class FinalInString {
    public static void main(String[] args) {
        final StringBuffer sb=new StringBuffer("NIT");
        sb.append(" "+"Hamirpur");
        System.out.println(sb);
       //use final after this line error show sb=new StringBuffer("in Hamirpur");
        System.out.println(sb); //before final =NIT Hamirpur
                                //              in Hamirpur
                               // after final use=only out put NIT Hmairpur
                               
                               //
    }
}
