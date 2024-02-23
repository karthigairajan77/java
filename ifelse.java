import java.util.*;
public class ifelse 
{
    public static void main(String[]args)
    {
    int a,b;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a value");
    a=scan.nextInt();
    System.out.println("Enter b value");
    b=scan.nextInt();
    if(a>b)
    {
        System.out.println("A is bigger than B");
    }
    else
    {
        System.out.println("B is bigger A");
    }
    scan.close();
    }
}
