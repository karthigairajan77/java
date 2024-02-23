
class method
{
    void display(int a , int b)
    {
        System.out.println("1st addition = "+(a+b));
    }
    void display(int a, double b , int c)
    {
        double d=a+b+c;
        System.out.println("using double = "+d);
    }
    void display(int a , int b , float c)
    {
        float flo = a+b+c;
        System.out.println("using float = "+flo);
    }
}
public class overload {
    public static void main(String[]args)
    {
        method obj = new method();
        obj.display(5,6);
        obj.display(4,5.5,7);
        obj.display(5, 6, 5.67f );
    }
}
