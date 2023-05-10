package de.shaukat.erum;

import de.shaukat.erum.model.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Student student1 = new Student("Erum",35,"A");
        //student1.setName("Erum");
        //student1.setAge(35);
        //student1.setGrade("A");

        System.out.println(student1.getName() + " is " + student1.getAge() + " years old, their grade is " + student1.getGrade());
        System.out.println(student1);


        Student student2 = new Student();
        student2.setName("Zied");
        student2.setAge(35);
        student2.setGrade("A+");

        System.out.println(student2.getName() + " is " + student2.getAge() + " years old, their grade is " + student2.getGrade());
        System.out.println(student2);

    }
}