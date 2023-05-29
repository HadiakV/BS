package main.java.Lessons.Lesson11.task1;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();


        String result1 = stack.push("\n Untouchable");

        stack.push("\n Hello");
        stack.push("\n Brother");
        stack.push("\n Hello");
        stack.push("\n Sister");
        stack.push("\n Im Watching");
        stack.push("\n Dont Worry ");

        boolean result = stack.add("\n Padre");



        System.out.println(stack);
        System.out.println(result);
        System.out.println(result1);

        System.out.println();

        String element = stack.pop();
        System.out.println("Pop : " + element);
        System.out.println(stack);

        element = stack.pop();
        System.out.println("Pop : " + element);
        System.out.println(stack);

        for (String value:
             stack) {
            System.out.println("FOR VALUE : " + value);
        }

        element = stack.peek();
        System.out.println("Peek : " + element);
        System.out.println(stack);

        System.out.println("Steck : ");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
