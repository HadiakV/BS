package main.java.LessonSumm.Lesson6.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Priorityn2 {
    public static void main(String[] args) {
        Queue<String> stringQue = new PriorityQueue<>();

        stringQue.add("I01");
        stringQue.add("I02");
        stringQue.add("I130");
        stringQue.add("I111");
        stringQue.add("I141");
   /*     stringQue.add("LOVE02");
        stringQue.add("BIG03");
        stringQue.add("COCIES04");
        stringQue.add("ENOUGHT05");*/

        System.out.println(stringQue);

        for (int i = 0; i < 5; i++) {
            System.out.println(stringQue.poll());
        }


    }
}
