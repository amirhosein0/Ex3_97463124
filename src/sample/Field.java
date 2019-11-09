package sample;

import java.util.ArrayList;

public class Field {
    private String  name;

    public Field(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private ArrayList<course> courses=new ArrayList<>();
    private ArrayList<Student> students=new ArrayList<>();

}

