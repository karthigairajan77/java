class demos
{
    void display()
    {
        System.out.println("Demos class called");
    }
}
class exam extends demos implements Runnable
{
    public void run()
    {
        display();
        for(int i =1; i<=5; i++)
        {
            System.out.println("Updated");
            try
            {
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class example extends Thread
{
    public void run()
    {

    
    for(int i=1; i<=5; i++)
    {
        System.out.println(i);
            try
            {
                Thread.sleep(4000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}
}
public class runablethread 
{
    public static void main(String[] args) throws Exception{
        Runnable exa = new exam();
        example ex = new example();
        Thread t = new Thread(exa);

        t.start();
        ex.start();
        t.join();
        ex.join();
        System.out.println("End of program");
    }
}
