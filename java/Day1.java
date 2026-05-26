import java.util.Scanner;
public class Day1
{
    public static void main(String [] args)
    {
        System.out.println("hello ");
        System.out.println("day 1");
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(n);
   student s=new student(1,"aashi");
   s.display();
   employee ram=new employee();
   employee sam=new employee();
   ram.id=1;
   ram.name="ram";
   ram.salary="20000";
   sam.id=2;
   sam.name="sam";
   sam.salary="40000";
   ram.display();
   sam.display();
  user u=new user("aashi","123");
  u.getusername();
  u.setusername("ram");
  u.getusername();
vehicle v=new vehicle();
v.start();
car c=new car();
c.drive();
c.start();
    }
}
class Rectangle
{
    int length;
    int breath;
    public Rectangle(int l,int b)
    {
        this.length=l;
        this.breath=b;
    }
    public void area()
    {
        System.out.println(length*breath);
    }
    public void perimeter()
    {
        System.out.println(length+breath);
    }
}
public class main{
    public static void main(String []args)
    {
        // Rectangle r=new Rectangle(2,3);
        // r.area();
        // r.perimeter();
        Student s=new Student("ram",10);
        s.grade();
    }
}
class Student{
    String name;
    int marks;
    public Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    public void grade()
    {
        if(marks>=90)
        {
            System.out.println("A");
        }
        else if(marks>=75)
        {
            System.out.println("B");
        }
        else if(marks>=50)
        {
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
}
import java.util.*;

class Student {

    int id;
    String name;
    int marks;

    public void add(int id, String name, int marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}

public class main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Student> arr = new ArrayList<>();

        int ch;

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            ch = s.nextInt();

            switch (ch) {

                case 1:

                    s.nextLine();

                    System.out.print("Enter Name: ");
                    String name = s.nextLine();

                    System.out.print("Enter ID: ");
                    int id = s.nextInt();

                    System.out.print("Enter Marks: ");
                    int marks = s.nextInt();

                    Student st = new Student();

                    st.add(id, name, marks);

                    arr.add(st);

                    System.out.println("Student Added");

                    break;

                case 2:

                    if (arr.size() == 0) {

                        System.out.println("No Students Found");
                    }

                    else {

                        for (int i = 0; i < arr.size(); i++) {

                            arr.get(i).display();
                        }
                    }

                    break;

                case 3:

                    System.out.println("Program Ended");
                    return;

                default:

                    System.out.println("Wrong Choice");
            }
        }
    }
}






 class vehicle
{
    void start()
    {
        System.out.println("starting........");
    }
}
 class car extends vehicle
{
    void drive()
    {
        System.out.println("driving.........");
    }
}




class user
{
    private String username;
    private String password;
    public user(String name,String pass)
    {
        this.username=name;
        this.password=pass;
    }
    public void getusername()
    {
        System.out.println(username);
    }
    public void setusername(String name)
    {
        this.username=name;
    }
}



class employee
{
    int id;
    String name;
    String salary;
    public void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }
}



 class student
{
    public int id;
    public String name;
    public student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void display()
    {
        System.out.println( id + name);
    }
}