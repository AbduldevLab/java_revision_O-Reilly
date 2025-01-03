import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //Can store anything
        ArrayList arrayList = new ArrayList();
        int i = 2;
        arrayList.add(i);
        String s = "Hello", s2=s;
        arrayList.add(s);
        arrayList.add(s2);
        System.out.println("This array list contains a " + arrayList + " and is of size " + arrayList.size());
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("Abduldevlab");
        System.out.println(stringArray);

        //ArrayList preserves the order and allow for duplicates
        //hashsets don't and will remove duplicates - based on their hash value

        HashSet<String> hashSet = new HashSet<>();
        //String h = "Hello", h2=h;
        hashSet.add(s);
        hashSet.add(s2);
        System.out.println(hashSet +" "+hashSet.size());

    }
}