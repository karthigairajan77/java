class students extends Thread {
   public void run (){
    for(int i =1;i<=10;i++)
    {
        System.out.println("Printed");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}

class employe {

    void display()
    {
        for(int i=1; i<=5; i++)
        System.out.println(i);
    }
}


public class texample {
    public static void main(String[] args) {
        students stu = new students();
        employe emp = new employe();
        stu.start();
        emp.display();
    }
}
