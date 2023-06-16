package de.shaukat.erum;
import org.openjdk.jmh.annotations.*;
import de.shaukat.erum.model.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class Main {
    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);

    }
    @Benchmark
    public static void run(){
        System.out.println("Hello and welcome!");
        //Student student1 = new Student("Erum",35,"A");
        //student1.setName("Erum");
        //student1.setAge(35);
        //student1.setGrade("A");

        //System.out.println(student1.getName() + " is " + student1.getAge() + " years old, their grade is " + student1.getGrade());
        //System.out.println(student1);


        /*Student student2 = new Student();
        student2.setName("Zied");
        student2.setAge(35);
        student2.setGrade("A+");*/

        //System.out.println(student2.getName() + " is " + student2.getAge() + " years old, their grade is " + student2.getGrade());
        //System.out.println(student2);

        //Student student3 = new Student("Matt");


        //System.out.println(student3.getName() + " is " + student3.getAge() + " years old, their grade is " + student3.getGrade());
        //System.out.println(student3);
        Student student1 = new ComputerScienceStudent("Erum",35,"A","a");
        Student student2 = new ComputerScienceStudent("Erum11",35,"A","A");
        Student student3 = new ComputerScienceStudent("Erum22",35,"A","A");

        //StudentDb db = new StudentDb(new Student.{student1,student2,student3});
        StudentDb db = new StudentDb();
        db.add(student1);
        db.add(student2);
        db.add(student3);
        db.add(student3);
        System.out.println(db.toString());

        StudentDbHashMap dbHashMap = new StudentDbHashMap();
        dbHashMap.put(student1.getName(),student1);
        dbHashMap.put(student2.getName(),student2);
        dbHashMap.put(student3.getName(),student3);

        System.out.println(dbHashMap.toString());
        System.out.println("Search by name "+ dbHashMap.getStudentsMapbyKey("Erum11"));
        System.out.println("A random student for questions "+dbHashMap.getRandomStudents());
        //Collections.addAll(db, student1,student2,student3);
        //System.out.println(db.findByName("y"));
        //System.out.println(db.toString());
        //System.out.println(db.getRandomStudents().toString());
        //Student cSstudent3 = new ComputerScienceStudent("Erum22",35,"A","B++");
        //System.out.println(cSstudent3.toString());
        //System.out.println(cSstudent3.study());
        //System.out.println(cSstudent3.getAdress());
        //System.out.println(cSstudent3.getIdentityCardNumber());

        //Student bStudent1 = new BiologyStudent("Name4",35,"A");
        //System.out.println(bStudent1.toString());
        //System.out.println(cSstudent3.study());
        //System.out.println(bStudent1.getAdress());

        PassportPrintService <Student> passportPrintService = new PassportPrintService<>();
        //System.out.println(passportPrintService.printPassport(student1));

    }
}