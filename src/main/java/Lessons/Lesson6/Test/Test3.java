package Lessons.Lesson6.Test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        List<Integer> atray = new ArrayList<>();
        atray.add(32);
        atray.add(27);
        atray.add(90);
        atray.add(20);
        atray.add(18);

        System.out.println(atray);
        advenchures(atray);
        System.out.println(atray);

    }

    public static void advenchures(List<Integer> karfagen){
        for (int i = 0; i < karfagen.size(); i++) {
            if (karfagen.get(i) % 2 == 0 ) {
                karfagen.remove(i);
            }
        }
    }





}
