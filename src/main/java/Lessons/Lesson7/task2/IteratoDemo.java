package Lessons.Lesson7.task2;

import java.util.*;

public class IteratoDemo {
    public static void main(String[] args) {
//        List <Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        Iterator <Integer> iterator = list.iterator();
//
//
//        while (iterator.hasNext()){
//            if (iterator.next() % 2 == 0){
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
     /*   List<String> str = new ArrayList<>();
        str.add("hello");
        str.add("JAVA");
        str.add("CAt");
        str.add("DOG");
        str.add("ARMEST");
        str.add("JUGERNAUT");
        Iterator<String> iterator1 = str.iterator();
        while (iterator1.hasNext()){
            Integer tmp= iterator1.next().length();
            if (tmp.lenght() % 2 == 0 ){
                iterator1.remove();
            }
            if (tmp == 3) {
                System.out.println(iterator1);
            }
                System.out.println(tmp);
        }*/

        Vector<String> list = new Vector<>();
        list.add("DOG");
        list.add("TErjer");
        list.add("GoldenArs");
        list.add("CentuaryLen");
        list.add("Cyngularity");

        Enumeration< String > en = list.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());

        }









    }

}
