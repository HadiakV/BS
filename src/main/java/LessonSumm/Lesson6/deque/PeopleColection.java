package main.java.LessonSumm.Lesson6.deque;

import java.util.Deque;
import java.util.LinkedList;

public class PeopleColection {
    public static void main(String[] args) {
        Deque<Person> peoples = new LinkedList<>();

        peoples.addFirst(new Person("John"));
        peoples.addFirst(new Person("Brayen"));
        peoples.addLast(new Person("Pedro"));
        peoples.add(new Person("Arthur"));

        System.out.println("NEW LINE : " );
        System.out.println(peoples);

//        System.out.println(peoples);
    }
}
