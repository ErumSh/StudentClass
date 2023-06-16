package de.shaukat.erum.model;

public class BiologyStudent extends Student{
    public BiologyStudent() {
    }

    public BiologyStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    public BiologyStudent(String name) {
        super(name);
    }

    @Override
    public String study() {
        return "Study!";
    }

    @Override
    public String getAdress() {
        return "Lab";
    }

    @Override
    public int getIdentityCardNumber() {
        return 33;
    }
}
