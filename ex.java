import java.util.*;
public class ex {
    public static void main(String[]args)
    {
        int a;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a");
        a=num.nextInt();
        if(a>0)
        {
            System.out.println("Positive");
        }
        else if(a==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negative");
        }
        num.close();
    }
}

