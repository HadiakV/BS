package main.java.DailyJournals.HM_4;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        final int SIZE = 100000000;

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= SIZE; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int temp : list) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println("For-each traversal time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for traversal time: " + (endTime - startTime) + " ms");

        int size = list.size();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Classic for with size variable traversal time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Reverse traversal time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iterator traversal time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator traversal time: " + (endTime - startTime) + " ms");
    }

}


