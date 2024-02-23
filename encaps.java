class student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class encaps {
    public static void main(String[] args) {
        student st = new student();
        st.setId(1);
        st.setName("Karthi");
        st.setAge(22);

        System.out.println("Student Id = " + st.getId());
        System.out.println("Student Name = " + st.getName());
        System.out.println("Student Age = " + st.getAge());
    }
    
}
