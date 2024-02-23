import java.util.*;
public class ex5 {
    public static void main(String[]args)
    {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enternum");
        num = scan.nextInt();
        int sum = 0;
        for(int i =1;i<=num;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
