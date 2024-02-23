import java.util.*;

public class arith {
    public static void main(String[]args)
    {
        // int a;
        // int b;
        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a value");
        // a=s.nextInt();
        // System.out.println("Enter b value");
        // b=s.nextInt();
        // System.out.println("a+b = "+(a+b));
        // System.out.println("a-b = "+(a-b));
        // System.out.println("a*b = "+(a*b));
        // System.out.println("a/b = "+(a/b));
        // System.out.println("a%b = "+(a%b));
         int m,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter m value");
        m=scan.nextInt();
        System.out.println("Enter n value");
        n=scan.nextInt();
        Boolean a = (m<=n);
        System.out.println("m<=n = "+a);
        Boolean b = (m>n);
        System.out.println("m>n = "+b);
        Boolean c = (m<n);
        System.out.println("m<n = "+c);
        Boolean d = (m==n);
        System.out.println("m==n = "+d);
        Boolean e = (m!=n);
        System.out.println("m!=n = "+e);
        Boolean f = (m>=n);
        System.out.println("m>=n = "+f);
        scan.close();
    }
}


