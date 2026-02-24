public class binary_Number {
    public static void main(String [] args){
        int a = 14;
        String b = "";
        while (a!=0) {
            int d = a%2;
            b = d + b;
            a=a/2;
        }
        System.out.println(b);
    }   
}
