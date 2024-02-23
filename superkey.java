class karthi
{
    String name = "Karthi";
}
class raja extends karthi
{
    String name = "Raja";
    void display()
{
    System.out.println(name);
    System.out.println(super.name);
}
}

public class superkey 
{
    public static void main(String[]args)
    {
        raja obj = new raja();
        obj.display();
    }
}
