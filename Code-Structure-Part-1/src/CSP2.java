public class CSP2 {
    private String myName = "abdul DevLab";

    public String getFirstName(){
        String[] values = myName.split(" ");
        return values[0];
    }

    public String getSurname(){
        String[] values = myName.split(" ");
        return values[values.length-1];
    }

    public static void doSomething(){
        System.out.println("Hi");
    }
}
