package Lessons.Lesson6.Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
       List<Integer> numbers = new ArrayList<>();
       numbers.add(0,4);
       numbers.add(1,8);

        System.out.println(numbers);

        numbers.add(8);
        numbers.add(9);


        System.out.println(numbers);


        List<Integer> aratrums = new ArrayList<>();
        aratrums.add(20);
        aratrums.add(32);



        System.out.println(aratrums);
        aratrums.addAll(1,numbers);
        System.out.println(aratrums);

        int value = aratrums.remove(5);

        System.out.println(aratrums);
        System.out.println(value);

        System.out.println(aratrums.get(5));

        aratrums.set(2,13);
        System.out.println(aratrums);

        System.out.println(aratrums.size());













    }
}
