public class ex8 {
    public static void main(String[]args)
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>i;j--)
            {
                for(int k=1;k<=i;k++)
                {
                    System.out.println("*");
                }
            }
        }
    }
}
