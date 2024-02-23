import java.util.*;
class parent {
    public String name;
    void display(String name)
    {
        System.out.println("Name = "+name);
    }
}
class child extends parent
{
    public int age;
    void inher(int age)
    {
        System.out.println("Age = "+age);
    }   
}
public class inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        child chl = new child();
        System.out.println("Enter name");
        chl.name=scan.nextLine();
        System.out.println("enter age");
        chl.age=scan.nextInt();
        
        chl.display(chl.name);
        chl.inher(chl.age);
        scan.close();
    }
}
