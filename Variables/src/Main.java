import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String name;
        int i = 15;
        int x = 5;
        long l = 10000000000L;
        double d = 2.0;
        System.out.println(--i + "\n" + l + "\n" + d);
        System.out.println("------------------");
        int modulus = 26 % 7;
        //double division = ++i / (double)x;
        System.out.println("i divided by x casted to double: " + ++i / (double) x);
        System.out.println("26 modulus 7 is: " + modulus);

/*
        var v = "dog";
        System.out.println(v);
*/
        boolean myAge = false;
        char alphabet = 'A';
        int[] myArray = {1, 2, 3};
        myArray[2] = 22;
        System.out.println("Third digit in the array = " + myArray[2]);

        char[] alphabetArray = {'a','b','c','d'};
        System.out.println(alphabetArray[0] +" & "+ alphabetArray[2]);


    }
}
