public class Find_length {
  public static void main(String[] args) {
    int a = 108;
    int d= 123;
    int n=0;
    while (a>0) 
    {
        a=a/10;
        n++;
    }
   int b = (int)Math.log10(d)+1;
    System.out.println(n);
    System.out.println(b);
    int c = 12345;
    String s= String.valueOf(c);
    int r = s.length();
    System.out.println(r);
  }
    }

