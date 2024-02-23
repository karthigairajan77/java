class vechial
{
    void display()
    {
        System.out.println("Raja class called");
    }
}
class scooty extends vechial
{
    void display()
    {
        System.out.println("Scooty class called");
    }
    void show()
    {
        display();
        super.display();
    }
}
public class supermethod {
    public static void main(String[]args)
    {
        scooty sc = new scooty();
        sc.show();
    }
}
