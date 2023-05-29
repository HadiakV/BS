package main.java.Lessons.Lesson9.Task2.Task3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Brazil");
        set1.add("Rio");
        set1.add("Bambuk");
        Set<String> set2 = new HashSet<>(set1);
        Set<String> set3 = new HashSet<>(20);
        Set<String> set4 = new HashSet<>(20,0.3f);

        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);
        set1.remove("Rio");

        System.out.println("long ago for deleted element ");


        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);



    }
}
