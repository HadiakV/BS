package main.java.Lessons.Lesson11.task3;

public class StackTest {
    public static int value = 10;
    public static void first(){
        second();

    }
    public static void second(){
        third();

    }
    public static void third(){
        four();

    }
    public static void four(){
        System.out.println("End Iteration is puling good");
    }
}
