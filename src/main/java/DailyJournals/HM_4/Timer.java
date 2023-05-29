package main.java.DailyJournals.HM_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Timer {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        //Feeling in list

        for (int i = 1; i <= 10000000 ; i ++) {
            list.add(i);
        }



        //For-each-------------------------------------------------------------------------

        long startTimer = System.currentTimeMillis();

        for (int temp:list) {

        }

        long endTimer = System.currentTimeMillis();
        long timeForeach = endTimer - startTimer;

        //For-i origin-------------------------------------------------------------------------

        startTimer = System.currentTimeMillis();

        for (int i = 0; i < list.size() ; i++) {
            int temp = list.get(i);
        }

        endTimer = System.currentTimeMillis();
        long timeForiOrigin = endTimer - startTimer;

        //For-i reverse-------------------------------------------------------------------------

        startTimer = System.currentTimeMillis();

        for (int i = list.size() -1; i >=0 ; i--) {
            int temp = list.get(i);
        }

        endTimer = System.currentTimeMillis();
        long timeForiReverse = endTimer - startTimer;

        //ITERATOR-------------------------------------------------------------------------

        startTimer = System.currentTimeMillis();

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int temp = iterator.next();
        }

        endTimer = System.currentTimeMillis();
        long  timeIterator = endTimer - startTimer;

        //ListIterator-------------------------------------------------------------------------

        startTimer = System.currentTimeMillis();

        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            int temp = listIterator.next();
        }

        endTimer = System.currentTimeMillis();
        long timeListIterator = endTimer - startTimer;



        //This is what wee get--------------------------------------------------------------------------

        System.out.println("Time For-each : " + "\n" + timeForeach + " Ms" + "\n" +
                "Time For-i origin : " + "\n" + timeForiOrigin + " Ms" + "\n" +
                "Time For-i Reverse : " + "\n" + timeForiReverse  + " Ms" + "\n" +
                "Time Iterator : " + "\n" + timeIterator + " Ms" + "\n" +
                "Time List-Iterator : " + "\n" + timeListIterator + " Ms" + "\n" +
                "This End Have good day)))");



    }

}
