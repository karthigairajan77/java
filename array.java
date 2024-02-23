import java.util.Scanner;

public class array {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
         int []num=new int[5];
         num[0]=1;
         num[1]=2;
         num[2]=3;
         num[3]=4;
         num[4]=5;
         int sum =0;
        // for(int i = 1;i<=num.length;i++)
        // {
            
        //         sum = sum+num[i];
            
        // }
        for (int number : num) {
               sum+=number;
               System.out.println(sum);
            }
    }
}
