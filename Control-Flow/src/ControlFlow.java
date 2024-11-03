import java.sql.SQLOutput;

public class ControlFlow {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int stop = 3;

        System.out.println("-------For Loop--------");
        //for loop
        for (int i = 0; i < 10; i++) {
            if (i < stop) {
                System.out.println("Hello abdulDevLab");
            }
        }
        double[] array = {12.4, 2.4, 6.8, 0.2};

        System.out.println("-------Enhanced For Loop--------");
        //enhanced for loop
        for (double i : array) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("-------While Loop--------");
        //while loop
        while (stop >= 0) {
            System.out.print(stop + ", ");
            stop--;
        }

        System.out.println();
        System.out.println("-------Do While Loop--------");
        //Do while loop
        int score = 4;
        do{
            System.out.print("The score is " +score + ", ");
            score++;
        } while (score <= 10);

        System.out.println();
        System.out.println("-------Conditions--------");

        int test = 0;
        //if statement
        if (test < 4 && test > 0){
            System.out.println("You failed the class.");
        }
        else if(test > 4 || test < 10){
            System.out.println("You have passed the class");
        }
        else if(test == 4 && test == 3.5){
            System.out.println("Pass by compensation.");
        }
        else{
            System.out.println("Invalid Score.");
        }

        System.out.println("-------switch statements--------");
        //switch statement
        switch(test){
            case 0:
                System.out.println("failed");
                break;
            case 4:
                System.out.println("Passed");
                break;
            default:
                System.out.println("You didnt take the exam");
                break;
        }


    }
}