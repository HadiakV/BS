package main.java.DailyJournals.HM_3;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DeleteStudentWithName {

    public static void dellStWNameUpg(List<Students> students){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the student you want to delete ");
        String name = scanner.nextLine();

        Iterator<Students> iterator = students.iterator();
        while(iterator.hasNext()){
            Students student = iterator.next();
            if (student.getName().equals(name)){
                iterator.remove();
            }
        }
        System.out.println(students);
    }


    public static void dellStWName(List<Students> students, String name) {
        Iterator<Students> iterator = students.iterator();
        while (iterator.hasNext()) {
            Students student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
            }
        }
        System.out.println(students);
    }




}
