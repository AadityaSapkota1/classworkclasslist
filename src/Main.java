import Model.students;
import Model.team;
import Model.group;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<students> A = new ArrayList<>();
        students stud1 = new students("Avarna","18","23012");
        students stud2 = new students("Ankit","18","23017");
        students stud3 = new students("Biplov","18","23011");
        students stud4 = new students("Bikarsha","18","23022");

        A.add(stud1);
        A.add(stud2);
        A.add(stud3);
        A.add(stud4);

        ArrayList<students> B = new ArrayList<>();
        students stud5 = new students("Sushant","18","23069");
        students stud6 = new students("Aaditya","17","23001");
        students stud7 = new students("Abhinav","18","23004");
        students stud8 = new students("Pranzal","18","23420");
        B.add(stud5);
        B.add(stud6);
        B.add(stud7);
        B.add(stud8);

        ArrayList<students> C = new ArrayList<>();
        students stud9 = new students("Ishan","18","23075");
        students stud10 = new students("Prasoon","18","23019");
        students stud11 = new students("Tatsam","16","23049");
        students stud12 = new students("Ashwin","18","230012");
        C.add(stud9);
        C.add(stud10);
        C.add(stud11);
        C.add(stud12);

        team t1 = new team("A",A);
        team t2 = new team("B",B);
        team t3 = new team("C",C);

        ArrayList<team> teamA = new ArrayList<>();
        ArrayList<team> teamB = new ArrayList<>();
        ArrayList<team> teamC = new ArrayList<>();

        group group1 = new group("Lobuche",teamA);
        group group2 = new group("Lobuche",teamB);
        group group3 = new group("Lobuche",teamC);












    }
}