public class over {
    int age;
    int id;
    String name;

    over(int a , String n)
    {
        age = a;
        name = n;
    }
    over(int a , int i, String n)
    {
        age = a;
        id = i;
        name = n;
    }
    public void display()
    {
        System.out.println(age+ " "+id+ " "+name);
    }
    public static void main(String[]args)
    {
        over ov = new over(22, "karthi");
        over con = new over(23, 01, "raja");
        ov.display();
        con.display();
    }
    
}    
