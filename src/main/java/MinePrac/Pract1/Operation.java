package MinePrac.Pract1;

public class Operation {
    public static void main(String[] args) {
        operations(10,5);
    }
    public static void operations(double a,double b){
        double sum;
        sum = a + b;
        System.out.println(sum);
        sum = a - b;
        System.out.println(sum);
        sum =a * b;
        System.out.println(sum);
        sum = a / b;
        System.out.println(sum);
        sum = a % b;
        System.out.println(sum);
    }


}
