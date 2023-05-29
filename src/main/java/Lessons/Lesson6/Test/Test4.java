package Lessons.Lesson6.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Ivor");
        words.add("Ivori");
        words.add("Ivore");
        words.add("Ivors");
        words.add("Ivorc");

        sumOfWordsLength(words);
    }

    public static int sumOfWordsLength(List<String> words){
    int length = 0;
    for(String i : words){
        length += i.length();}
    return length;
    }
}
