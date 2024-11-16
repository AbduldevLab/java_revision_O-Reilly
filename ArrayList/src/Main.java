import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //Can store anything
        ArrayList arrayList = new ArrayList();
        int i = 2;
        String s = "Hello";
        arrayList.add(i);
        arrayList.add(s);
        System.out.println("This array list contains a " + arrayList + " and is of size " + arrayList.size());
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("Abduldevlab");
        System.out.println(stringArray);

        //ArrayList preserves the order and allow for duplicates
        //hashsets don't and will remove duplicates - based on their hash value
    }
}