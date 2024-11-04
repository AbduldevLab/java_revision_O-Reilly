public class Strings {
    public static void main(String[] args) {
        String myName = "abdulDevLab";
        int length = myName.length();
        System.out.println("My name is: " + myName + " which is " + length + " characters long");
        //Convert myName to uppercase
        String upperCase = myName.toUpperCase();
        System.out.println(upperCase);

        //Should return false
        System.out.println(upperCase.startsWith("ABZ"));
        //Position of dev - returns a number
        System.out.println(upperCase.indexOf("DEV"));
        //Cut/chop myName from index at given integer position
        System.out.println(upperCase.substring(5, 9));
        //replace parts of a string
        System.out.println(myName.replace("Lab", "Best"));

        String test = "abduldevlab";
        String test2 = "abdulDevLab";
        boolean isItTheSame = myName.equals(test);
        System.out.println("Test 1: " + isItTheSame);
        boolean isItTheSame2 = myName.equals(test2);
        System.out.println("Test 2: " + isItTheSame2);

        String firstDay = "Monday";

        String lastDay;
        if (firstDay.equals("Monday")) {
            lastDay = "Sunday";
        } else {
            lastDay = "Friday";
        }
        System.out.println("-----Ternary operator-----");
        //Ternary operator
        String nextDay = firstDay.equals("Monday") ? "Tuesday" : "Sunday";
        System.out.println(nextDay);
        int x = 10;
        //if even print false / if odd print true
        boolean evenOpposite = (x % 2) == 0 ? false : true;
        System.out.println(evenOpposite);

        //Placeholders
        System.out.println(String.format("Today is %s, and tomorrow is %s", firstDay, nextDay));

        String colours = "blue, green, red, purple, orange";
        String[] colourArray = colours.split(", ");

        System.out.println("String -> array : ' split '");
        for (String colour : colourArray){
            System.out.println(colour);
        }
    }
}