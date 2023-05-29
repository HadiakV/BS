package main.java.LessonSumm.Lesson6.queue;

public class Customer {
    private String name;
     private  int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
