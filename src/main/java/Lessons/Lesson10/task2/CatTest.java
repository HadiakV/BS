package main.java.Lessons.Lesson10.task2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat(7,"Read",4.100);
        Cat cat2 = new Cat(7,"Read",4.100);
        Cat cat3 = new Cat(4,"White",3.562);

        boolean result = cat1 == cat2;
        System.out.println("Equals primitive : " + result);

        result = cat1.equals(cat2);
        System.out.println("Equals object : " + result);


        System.out.println(" ----------------------- ");


        Set<Cat> cats = new TreeSet<>();

        cats.add(new Cat(5,"Purple",3.33));
        cats.add(new Cat(3,"White",3.67));
        cats.add(new Cat(3,"Green",4.67));
        cats.add(new Cat(3,"Purple",4.67));
        cats.add(new Cat(3,"Red",4.67));
        cats.add(new Cat(3,"Orange",4.67));
        cats.add(new Cat(3,"Black",5.67));
        cats.add(new Cat(3,"Yellow",6.67));
        cats.add(new Cat(2,"Red",4.78));
        cats.add(new Cat(6,"Orange",4.33));
        cats.add(new Cat(7,"Black",2.23));
        cats.add(new Cat(8,"Yellow",5.67));
        cats.add(new Cat(9,"Green",2.93));


        for (Cat cat: cats) {
            System.out.println(cat);
        }
        System.out.println("-------------------------");

        Set<Cat> cats1 = new TreeSet<>(new CatCamparator());
        cats1.addAll(cats);
        for (Cat cat: cats1 ) {
            System.out.println(cat);

        }

    }
}
