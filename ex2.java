import java.util.*;
public class ex2 {
    public static void main(String[]args)
    {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        year=scan.nextInt();
        if(year%4== 0)
        {
            System.out.println("It is leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
        scan.close();
    }
}
