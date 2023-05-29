package main.java.Lessons.Lesson9.Task1;

import java.util.*;

public class SortedSetTest {
    public static void main(String[] args) {

        SortedSet<String> set = new TreeSet<>();

        set.add("rama");
        set.add("inrzektor");
        set.add("rector");
        set.add("arab");
        boolean result1 =  set.add("protector");
        boolean result2 = set.add("arab");
        set.add("bluez");
        set.add("Arab");
        set.add("Blues_protector");
        System.out.println(set);
        System.out.println(result2);
        System.out.println("contains");

        System.out.println(set.contains("rector"));
        System.out.println(set.contains("flame"));

        System.out.println("First : ");
        System.out.println(set.first());

        System.out.println("Last : ");
        System.out.println(set.last());
        result1 = set.remove("arab");
        result2 = set.remove("fraction");

        System.out.println("Pislia udalenia : ");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(set);

        System.out.println("Remove ALL : ");


        List<String> list = new ArrayList<>();
        list.add("Arab");
        list.add("Blues_protector");

        set.removeAll(list);
        System.out.println(set);


    }

    public static class SetTest {
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

            while (iterator.hasNext()){
                String elem = iterator.next();
                System.out.println(elem + " " + (elem.length() % 2 == 0 ));
            }
        }
    }
}
