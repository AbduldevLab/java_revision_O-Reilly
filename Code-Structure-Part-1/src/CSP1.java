public class CSP1 {

    static String myName = "AbdulDEvLab";
    public static void main(String[] args) {
        System.out.println("--------Methods--------");

        for (String arg : args) {
            System.out.println(arg);
        }
        addTwoNumbers(2, 2);
        System.out.println(subtractNumbers(-7, 8) + " is a " + subtractNumbersT(-7, 8));
        //Instantiating CSP2 class objects
        CSP2 csp2 = new CSP2();
        CSP2 csp22 = new CSP2();

        System.out.print(csp2.getFirstName() + ' ');
        System.out.println(csp22.getSurname());
        //static method - no need to instantiate
        CSP2.doSomething();

    }

    public static void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
        printName("AbdulDevaLab");
    }

    public static void printName(String name) {
        System.out.println("My name is: " + name + '.');
    }

    public static int subtractNumbers(int num1, int num2) {
        //System.out.println(num1-num2);
        if ((num1 - (-num2)) < 0) {
            return -1;
        } else {
            return +1;
        }
    }

    public static String subtractNumbersT(int num1, int num2) {
        System.out.println(myName + " from the class level.");
        return (num1 - (-num2)) < 0 ? "Negative" : "Positive";
    }

}