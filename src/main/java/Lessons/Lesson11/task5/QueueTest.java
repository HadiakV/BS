package main.java.Lessons.Lesson11.task5;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> que = new PriorityQueue<>();

        que.add("Zavvala");
        que.add("Ikora");
        que.add("Cayde-6");
        que.add("Osiris");
        que.add("Shaxx");
        que.add("Deverim Key");

        System.out.println(que);
        while(!que.isEmpty()){
            System.out.println(que.poll());
        }

    }
}
