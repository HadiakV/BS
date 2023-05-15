package DailyJournals.TictacToe;

import java.util.Scanner;

public class Players {
    String name;
    char x;
    char o;

    public static void mMove(char[][] table, char sym, Scanner scaner) {
        int hid,wid;
        do {
            System.out.println("Vvedite nomer stroki i stolbca cherez probel: ");
            hid = scaner.nextInt();
            wid = scaner.nextInt();
        } while (table[hid][wid] != ' ');
            table[hid][wid] = sym;

}


    public Players(String name, char x, char o) {
        this.name = name;
        this.x = x;
        this.o = o;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", o=" + o +
                '}';
    }

    public char getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }

    public char getO() {
        return o;
    }

    public void setO(char o) {
        this.o = o;
    }
}
