package de.shaukat.erum.model;

public class ComputerScienceStudent extends Student {
    private String cSgrade;

    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(String cSgrade) {
        this.cSgrade = cSgrade;
    }

    public ComputerScienceStudent(String name, int age, String grade, String cSgrade) {
        super(name, age, grade);
        this.cSgrade = cSgrade;
    }

    public String getcSgrade() {
        return cSgrade;
    }

    public void setcSgrade(String cSgrade) {
        this.cSgrade = cSgrade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cSgrade='" + cSgrade +
                '}';
    }
    public String study()
    {
        return "Study please";
    }

    @Override
    public String getAdress() {
        return "university";
    }

    @Override
    public int getIdentityCardNumber() {
        return 122;
    }
}
