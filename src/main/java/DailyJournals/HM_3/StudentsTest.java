package main.java.DailyJournals.HM_3;

import java.util.LinkedList;
import java.util.List;

import static main.java.DailyJournals.HM_3.DeleteStudentBelow3.dellStudB3;
import static main.java.DailyJournals.HM_3.DeleteStudentWithName.*;

public class StudentsTest {
    public static void  main(String[] args) {
        List<Students> student = new LinkedList<>();

        student.add(new Students("Arthur","Arthorius",3,7));
        student.add(new Students("Avreliy","Avgustin",5,5));
        student.add(new Students("Leonid","First",4,8));
        student.add(new Students("Leonardo","da Vinci",5,10));
        student.add(new Students("Jovanni"," Vinchenco",2,10));

//        System.out.println(student);

        dellStudB3(student);
        dellStWName(student," ");
        dellStWNameUpg(student);


    }
}
