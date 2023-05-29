package LessonSumm.Lesson3;

import java.util.ArrayList;
import java.util.ListIterator;

public class CatArr {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat murzik = new Cat("murzik");
        Cat ara = new Cat("ara");
        Cat barsic = new Cat("barsic");
        Cat lastochka = new Cat("lastochka");
        Cat pushok = new Cat("pushok");
        cats.add(murzik);
        cats.add(ara);
        cats.add(barsic);
        cats.add(lastochka);
        cats.add(pushok);
        System.out.println(cats);

        ListIterator<Cat> catListIterator = cats.listIterator();
        while (catListIterator.hasNext()){
            Cat tempCat = catListIterator.next();
            System.out.println(tempCat);

            if (tempCat.getName().equals("lastochka")){
                System.out.println("Find equals");
                catListIterator.remove();
                System.out.println("delete element");
                catListIterator.add(new Cat("baraban"));
            }

        }


        System.out.println(cats);

    }
}
