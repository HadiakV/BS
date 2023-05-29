package main.java.LessonSumm.Lesson6.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> ara = new Stack<>();
        ara.push(" I ");
        ara.push(" Love ");
        ara.push(" Cocies ");
        System.out.println(ara);

        String str = ara.peek();
        System.out.println(str);

        System.out.println(ara);

        str = ara.pop();
        System.out.println(str);
        System.out.println(ara);

        System.out.println(ara.isEmpty());



    }
}
