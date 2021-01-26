package btnvt5_19;

import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private String age;

    public Student(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    public static void main(String[] args) {
        ArrayList  ls = new ArrayList<Student>();
        Student person1 = new Student(" 1", " nguyen van ro "," 21 ");
        
        Student person2 = new Student(" 2", " nguyen van teo "," 20");
        ls.add(person1);
        ls.add(person2);
       
        System.out.println("List \n " +ls);
    }
    
}