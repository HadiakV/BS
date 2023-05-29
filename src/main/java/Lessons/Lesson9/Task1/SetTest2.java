package main.java.Lessons.Lesson9.Task1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest2 {
    public static void main(String[] args) {
        SortedSet<String> seta = new TreeSet<>();
        seta.add("Arben");
        seta.add("Incedible");
        seta.add("Distructione");
        seta.add("Batreon");
        seta.add("Sanctuary");

        System.out.println(seta);
        for (String elem :
                seta) {
            System.out.println(elem + " " + elem.length());
        }

        Iterator<String> iterator = seta.iterator();

        /*while (iterator.hasNext()){
            String elem = iterator.next();
            if (elem.length() % 2 == 0){
                System.out.println(iterator.next() + " true ");
            }else {
                System.out.println(iterator.next() + " false ");
            }*/

        while (iterator.hasNext()) {
            String elem = iterator.next();
            System.out.println(elem + " " + (elem.length() % 2 == 0));
        }
    }
}
