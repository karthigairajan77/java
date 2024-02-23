import java.util.*;
class cons{
    cons(int m, int n)
    {
        System.out.println("m+n = "+(m+n));
    }
}
public class construct {
    public static void main(String[]args)
    {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value");
        a=scan.nextInt();
        System.out.println("Enter b value");
        b=scan.nextInt();
        cons obj = new cons(a,b);
    }
}
