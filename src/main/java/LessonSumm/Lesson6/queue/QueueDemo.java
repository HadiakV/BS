package main.java.LessonSumm.Lesson6.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        int time = 25;

        for (int i = time; i >= 0 ; i--) {
            que.add(i);
        }

        System.out.println(que);
        System.out.println("*****REMOVE FROM COLECTION **********");

        while (!que.isEmpty()){
            Integer numFR = que.remove();
            System.out.println(" Rm Mv " + numFR);
            System.out.println(que);

        }


    }
}
