package Lessons.Lesson6.Test;

import java.util.Iterator;
import java.util.List;

public class NotUsed {
    public static void removeEvenValues(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer currentElem = iterator.next();
            if(currentElem%2==0){
                iterator.remove();
            }
        }
    }



}
