import java.util.*;
class stu
{
    int id;
    String name;
    String display()
    {
         //System.out.println(id+ " " +name);
        Scanner scan = new Scanner(System.in);
        //  System.out.println("Enter id");
        //  id=scan.nextInt();
        //  scan.nextLine();
         System.out.println("Enter name");
         name=scan.nextLine();
         return name;
    }
}
public class student {
    public static void main(String[]args)
    {
         stu s=new stu();
         String output=s.display();
         System.out.println(output);
    }
}
