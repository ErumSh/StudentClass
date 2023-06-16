package de.shaukat.erum.model;

import java.util.LinkedList;
import java.util.Objects;

public class StudentDbLinkedList {
    private LinkedList<Student> studentdLinkedList = new LinkedList<>();

    public StudentDbLinkedList() {
    }

    public StudentDbLinkedList(LinkedList<Student> studentdLinkedList) {
        this.studentdLinkedList = studentdLinkedList;
    }

    public LinkedList<Student> getStudentdLinkedList() {
        return studentdLinkedList;
    }

    public void setStudentdLinkedList(LinkedList<Student> studentdLinkedList) {
        this.studentdLinkedList = studentdLinkedList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDbLinkedList that = (StudentDbLinkedList) o;
        return Objects.equals(studentdLinkedList, that.studentdLinkedList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentdLinkedList);
    }

    @Override
    public String toString() {
        return "StudentDbLinkedList{" +
                "studentdLinkedList=" + studentdLinkedList +
                '}';
    }
}
