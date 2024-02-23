
class student extends Thread {
    void display(){
    for(int i =1;i<=5;i++)
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

class employee {

    void run()
    {
        for(int i=1; i<=5; i++)
        System.out.println(i);
    }
}

public class threadexam {
    public static void main(String[] args) {
        student stu = new student();
        employee emp = new employee();
        stu.start();
        emp.run();
    }
}
