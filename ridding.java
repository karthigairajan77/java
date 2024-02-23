class bike {
    public void display(int a,int b)
    {
        System.out.println("bike class calling  "+(a+b));
    }
}
class car extends bike {
    public void display(int a,int b)
    {
        System.out.println("car class calling  "+(a+b));
    }
}
public class ridding {
    public static void main(String[] args) {
        car obj = new car();
        obj.display(5, 6);

        bike b = new bike();
        b.display(3, 5);
    }
}
