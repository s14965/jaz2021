package pl.pjatk.szymaj;

import org.springframework.beans.factory.annotation.Value;

public class Pojo {
    private String sField = "Hello";

    public Pojo(String sField) {
        this.sField = sField;
        System.out.println(sField);
    }

    public String getsField() {
        return sField;
    }

    public void setsField(String sField) {
        this.sField = sField;
    }

    public void outString() {
        System.out.println(sField);
    }
}
