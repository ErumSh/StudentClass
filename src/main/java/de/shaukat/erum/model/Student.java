package de.shaukat.erum.model;

import java.util.Objects;

public abstract class Student implements Citizen{
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
        return " name= " + name + " = " + " age = " + age + " grade = " + grade + " ";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, grade);
    }
    public abstract String study();
}
