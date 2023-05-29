package Lessons.Lesson6.Test;

public class MyLIstArray {

    private String[] list = new String[10];

    private int size = 0;



    public void add(String value,int i){

        if (size >= i){
            list[i] = value;
            size++;

        }

        list[i] = value;

    }

    public void add(String value){
        list[size++] = value;
    }





}
