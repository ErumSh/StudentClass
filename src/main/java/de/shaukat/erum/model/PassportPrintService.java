package de.shaukat.erum.model;

public class PassportPrintService <T>{
    private T text;

    public PassportPrintService() {
    }

    public PassportPrintService(T text) {
        this.text = text;
    }

    public T getText() {
        return text;
    }

    public void setText(T text) {
        this.text = text;
    }

    public String printPassport (T text){
        return "++++++++++++++"+text.toString()+"++++++++++++++++";
    }
}
