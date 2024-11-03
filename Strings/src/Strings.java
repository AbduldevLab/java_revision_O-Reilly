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
        System.out.println("Test 1: "+ isItTheSame);
        boolean isItTheSame2 = myName.equals(test2);
        System.out.println("Test 2: "+ isItTheSame2);


    }
}