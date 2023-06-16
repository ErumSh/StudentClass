package de.shaukat.erum.model;

import java.util.*;

public class StudentDb {
    //private Student [] students;
    private List<Student> students = new ArrayList<>();

    public StudentDb(List<Student> students) {
        this.students = students;
    }

    public StudentDb() {
    }

    /*public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }*/

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentDb{" +
                "students=" + students +
                '}';
    }

    //@Override
    /*public String toString() {
        return "StudentArray{" +
                "students=" + Arrays.toString(students) +
                '}';
    }*/


    public Student getRandomStudents() {
        Random rand = new Random();
        int maxArraySize = students.size();
        return students.get(rand.nextInt(maxArraySize));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDb studentDb = (StudentDb) o;
        return Objects.equals(students, studentDb.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
    public void add(Student student){
        students.add(student);
    }


    public Student findByName(String name)
    {
        try{
            for (Student anyStudent : students){
            //for (int i = 0; i < students.; i++) {
                if(anyStudent.getName() == name)
                {
                    return anyStudent;
                }

            }
        }catch (Exception e)
        {
            System.out.println("Not in db");
        }
        return null;
    }
}
