package de.shaukat.erum.model;

public class Student {
    private String name;
    private int age;
    private String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public String toString ()
    {
        return name + " is " + age + " years old, their grade is " + grade;

    }
}
