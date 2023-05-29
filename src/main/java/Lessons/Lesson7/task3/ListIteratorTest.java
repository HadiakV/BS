package Lessons.Lesson7.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
   /*     List<String> list = new ArrayList<>();
        list.add("Saturn");
        list.add("Jupiter");
        list.add("Mars");
        list.add("Venera");
        list.add("Titan");

        Iterator<String> iterator = list.listIterator();

        while(iterator.hasNext()){
            String earth = iterator.next();
            if (earth.length() == 6){
                System.out.println(earth);
                break;
            }

        }
        while (((ListIterator<String>) iterator).hasPrevious()){
            System.out.println(((ListIterator<String>) iterator).previous());
        }

    }*/
        List<String> list = new ArrayList<>();
        list.add("Aaaa");
        list.add("Bbbb");
        list.add("Cvccc");
        list.add("Dcsfdgg");
        list.add("Bvv");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasPrevious()) {
            String tmp = listIterator.previous();
            System.out.println(tmp);
            if (tmp.equals("B")){
                listIterator.add("AA");
            }
        }
        System.out.println(list);

    }





}