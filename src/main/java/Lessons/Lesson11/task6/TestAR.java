package main.java.Lessons.Lesson11.task6;

public class TestAR {
    public static void main(String[] args) {
        MyArrayDeque deque = new MyArrayDeque();
        deque.addToHead(4);
        System.out.println(" NW" + deque );
        deque.addToHead(3);
        System.out.println(deque );
        deque.addToHead(2);
        System.out.println(deque );
        deque.addToHead(1);
        System.out.println(deque);
        deque.addToHead(5);
        System.out.println(deque);

        System.out.println(deque.peekHead());
        System.out.println(deque.size());



    }
}
