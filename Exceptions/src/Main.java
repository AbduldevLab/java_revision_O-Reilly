import javax.print.attribute.URISyntax;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;

public class Main {

    public static void dividedByZero(int denominator) {
        System.out.println(17 / denominator);
    }

    public static void createURI() {
        try {
            URI uri = new URI("https://www.google.com");
            System.out.println("The uri was created");
        } catch (URISyntaxException e) {
            //System.out.println("The uri was not created");
            throw new IllegalArgumentException();
        } catch (ArithmeticException e) {
            System.out.println("Caught");
        } finally {

            System.out.println("This is final");
        }
    }

    public static void createURIv2() throws URISyntaxException {

        URI uri = new URI("-https://www.google.com");
        //System.out.println("The uri was created");

    }

    public static void main(String[] args) {
        //ystem.out.println("Hello world!");

        //Arrays are zero based
        //Integer[] integereArray = new Integer[]{1, 2, 3, 4, 5};

        dividedByZero(4);
        //dividedByZero(0);

//        LocalDate today = null;
//        if (today != null)
//            System.out.println(today.getMonth());
//
//        String hello = "Hello";
//        Double value = Double.valueOf(hello);

        try {
            User user1 = new User("Jack", 5);
            User user2 = new User("Abdul", 201);
        } catch (InvalidAgeException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

        try {
            createURI();
        } catch (IllegalArgumentException e) {
            System.out.println("the exception was caught");
        }
        //createURIv2();


    }
}