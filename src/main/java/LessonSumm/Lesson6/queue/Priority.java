package main.java.LessonSumm.Lesson6.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Priority {
    public static void main(String[] args) {
        Queue<Integer> integerQue = new PriorityQueue<>();
        Random random = new Random();
        for (int i =0; i <7; i++){
            Integer newElem = random.nextInt(100);
            System.out.println("New Elem : " + newElem);
            integerQue.add((new Integer(newElem)));
        }
        System.out.println(integerQue);

        for (int i = 0; i < 7; i++) {
            System.out.println(integerQue.poll());
        }

        System.out.println(integerQue);
    }
}
