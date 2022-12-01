package Model;

import java.util.ArrayList;

public class team {
    String name;

    ArrayList<students> studentsArrayList;

    public team(String name, ArrayList<students> studentsArrayList) {
        this.name = name;
        this.studentsArrayList = studentsArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<students> getStudentsArrayList() {
        return studentsArrayList;
    }

    public void setStudentsArrayList(ArrayList<students> studentsArrayList) {
        this.studentsArrayList = studentsArrayList;
    }
}
