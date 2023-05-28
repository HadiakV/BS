package main.java.DailyJournals.HM_3;

public class Students {
    String name;
    String lastName;
    int numberCurse;
    double averageMark;

    public Students(String name, String lastName, int numberCurse, double averageMark) {
        this.name = name;
        this.lastName = lastName;
        this.numberCurse = numberCurse;
        this.averageMark = averageMark;

    }

    @Override
    public String toString() {
        return "\n Students : " + name + " "  + lastName + "\n" +
                " Curse : " + numberCurse +
                " GPA : " + averageMark  ;
    }

    public Students() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberCurse() {
        return numberCurse;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumberCurse(int numberCurse) {
        this.numberCurse = numberCurse;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
