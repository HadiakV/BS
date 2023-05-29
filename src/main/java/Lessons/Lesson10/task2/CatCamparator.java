package main.java.Lessons.Lesson10.task2;

import java.util.Comparator;
import java.util.Objects;

public class CatCamparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        //equals age cats
        //if age != back % in age
        //if age == then equals weights cats
        //if weight != back % in weights cats
        //if weights == then equals colors in ASK

        if (cat1.getAge() != cat1.getAge()) {
            return cat1.getAge() - cat2.getAge();
        }
        if (Double.compare(cat1.getWeight(), cat1.getWeight()) != 0) {
            Double.compare(cat1.getWeight(), cat2.getWeight());
        }
        if (cat1.getColor() != null) {
            return cat1.getColor().compareTo(cat2.getColor());
        }
        return 0;
    }
}
