package main.java.DailyJournals.HM_3;

import java.util.Iterator;
import java.util.List;

public class DeleteStudentBelow3 {


    public static void dellStudB3(List<Students> students){
        Iterator<Students> iterator = students.iterator();
        while(iterator.hasNext()){
            Students student = iterator.next();
            if (student.getNumberCurse() < 3){
                iterator.remove();
            }
        }
        System.out.println(students);
    }




}
