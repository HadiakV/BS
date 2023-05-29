package Lessons.Lesson7.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("X");
        list.add("D");
        list.add("B");
        list.add("A");

        Iterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
