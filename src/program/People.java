package program;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class People {
    String name;
    int age;
    static int count; // static: duoc tao ra kem voi class

//    public People()
//    {
//        count++;
//        name = "New person";
//        age = 0;
//    }

    public People(String name, int age)
    {
        count++;
        this.name=name;
        this.age=age;
    }

    public void walk()
    {
        System.out.println(name + " is walking...");
    }

    public static void main(String[] args)
    {
        People person1 = new People("John", 20);
        System.out.println(person1.name);
    }
}

class Student extends People{
    double GPA;
    public Student(String name, int age)
    {
        super(name, age);
        this.GPA=3.0;
    }


}
