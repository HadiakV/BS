package main.java.Lessons.Lesson10.task1;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 5;

        boolean result = a == b;
        System.out.println("a and b : " + result);
        result = a == c;
        System.out.println("a and c : " +result);

        Integer i = 5;
        result = a == i;
        System.out.println("Integer and a : " + result);

        Integer i1=new Integer(5);
        result = i ==i1;
        System.out.println("Equals Integer : "  + result);

        String s1 = "Hello";
        String s2 = new String("Hello");
        result = s2 == s1;

        System.out.println("Стринги : "+result);
    }
}
