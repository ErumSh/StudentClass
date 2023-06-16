package de.shaukat.erum.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class StudentDbHashMap {
    private Map<String,Student> studentsMap= new HashMap<>();

    public StudentDbHashMap() {
    }

    public StudentDbHashMap(Map<String, Student> studentsMap) {
        this.studentsMap = studentsMap;
    }

    public Map<String, Student> getStudentsMap() {
        return studentsMap;
    }


    public void setStudentsMap(Map<String, Student> studentsMap) {
        this.studentsMap = studentsMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDbHashMap that = (StudentDbHashMap) o;
        return Objects.equals(studentsMap, that.studentsMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentsMap);
    }
    public Student findByName(String name) {
        try {
            for (Student anyStudent : studentsMap.values()) {
                //for (int i = 0; i < students.; i++) {
                if (anyStudent.getName() == name) {
                    return anyStudent;
                }

            }
        } catch (Exception e) {
            System.out.println("Not in db");
        }
        return null;
    }
    public void put(String name, Student student){
        studentsMap.put(name, student);
    }

    @Override
    public String toString() {
        return "StudentDbHashMap{" +
                "studentsMap=" + studentsMap +
                '}';
    }
    public Student getStudentsMapbyKey(String name) {
        return studentsMap.get(name);
    }
    public Student getRandomStudents() {
        Random rand = new Random();
        int maxMapSize = studentsMap.size();
        String [] arrayOfNames = studentsMap.keySet().toArray(new String[0]);
        String randomKey = arrayOfNames [rand.nextInt(maxMapSize)];
        return studentsMap.get(randomKey);
    }

}
