class demo
{
    void display(int a)
    {
        
        if(a%2!=0)
        {
            throw new ArithmeticException("Odd Exception");
        }
        else
        {
            System.out.println("This is Even number  "+a);
        }
    }
}

public class throwex {
    public static void main(String[]args)
    {
        demo dm = new demo();
        dm.display(5);
    }
}
