class sprcons
{
    sprcons()
    {
        System.out.println("Spr class called");
    }

}
class spcons extends sprcons
{
    spcons()
    {
        super();
        System.out.println("Spcons class called");
        
        
    }
}
public class supercons {
    public static void main(String[]args)
    {
        spcons con = new spcons();
        // con.spcons();
    }
    
}
