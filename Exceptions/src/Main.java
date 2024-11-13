import java.time.LocalDate;

public class Main {

    public static void dividedByZero(int denominator) {
        System.out.println(17 / denominator);
    }

    public static void main(String[] args) {
        //ystem.out.println("Hello world!");

        //Arrays are zero based
        //Integer[] integereArray = new Integer[]{1, 2, 3, 4, 5};

        dividedByZero(4);
        dividedByZero(0);

        LocalDate today = null;
        if (today != null)
            System.out.println(today.getMonth());

        String hello = "Hello";
        Double value = Double.valueOf(hello);

    }
}