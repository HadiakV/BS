package Lessons.Lesson7.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zeus");
        list.add("Poseidon");
        list.add("Germes");
        list.add("HEphestus");
        list.add("Apollo");
        list.add("Ares");
        list.add("Arthemida");
        list.add("Aid");

        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        Spliterator<String> spliterator3 = spliterator1.trySplit();

        spliterator1.forEachRemaining(x -> System.out.println("spliterator 1 : " + x));
        spliterator2.forEachRemaining(x -> System.out.println("spliterator 2 : " + x));
        spliterator3.forEachRemaining(x -> System.out.println("spliterator 3 : " + x));



    }
}
