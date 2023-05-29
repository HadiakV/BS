package Lessons.Lesson6.Test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> numbersArd = new ArrayList<>();
        numbersArd.add(16);
        numbersArd.add(23);

        System.out.println(numbersArd);

        сhangeValue(numbersArd);
    }

    private static List<Integer> сhangeValue(List<Integer> numbersArd) {
        List<Integer> newLists = new ArrayList<>();
        for (Integer i : numbersArd) {
            newLists.add(i * 2);
        }
        return newLists;
    }
}
