import java.util.*;
import java.io.*;
public class Example1{
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(1,"abc",23));
        al.add(new Student(2,"def",21));
        al.add(new Student(3,"ghi",22));

        Collections.sort(al);
        for(Student st:al)
        System.out.println(st.rollno+" "+st.name+" "+st.age);
    }
}


class Student implements Comparable<Student>{
int rollno;
String name;
int age;
Student(int rollno,String name,int age)
{
    this.rollno=rollno;
    this.name=name;
    this.age=age;
}
public int compareTo(Student s1)
{
System.out.println(age+" "+s1.age);

    if(age==s1.age)
        return 0;

    else if(age>s1.age)
        return 1;
    else return -1;
}
}

