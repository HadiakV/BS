package main.java.Lessons.Lesson9.Task2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
public class CuncurentSetList {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

        set.add("Aratrum");
        set.add("Olymp");
        set.add("Flames");
        set.add("Gorr");
        set.add("LigtingBolt");
        set.add("WaterrShtorm");
        set.add("Argus");

        Iterator<String> iterator = set.iterator();

        int counter = 1;

        List<String> itemsForRemove = new ArrayList<>();
        itemsForRemove.add("Olymp");
        itemsForRemove.add("Flame");
        itemsForRemove.add("Lighting");


        while (iterator.hasNext()){
            String item = iterator.next();
            // Flame ,lenght
            System.out.printf("%d.%s,lenght: %d\n", counter++,item , item.length());



            if (itemsForRemove.contains((item))){
                iterator.remove();
            }

            System.out.println();
            System.out.println(set);


            System.out.println();
            int i = 5;
            System.out.println(i++);

            System.out.println(i);



        }



    }

}
