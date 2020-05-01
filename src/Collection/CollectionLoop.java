package Collection;

import java.util.*;

public class CollectionLoop {

    String strArr[] = new String[5];
    List<String> stringList = new ArrayList<String>();
    Set<String> stringSet = new HashSet<String>();

    public void getElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five data elements");
        for (int i = 0; i < 5; i++) {
            String element = sc.nextLine();
            strArr[i] = element;
            stringList.add(element);
            stringSet.add(element);
        }
    }

    public void displayElements(){
        for (String s : stringSet) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        CollectionLoop collection = new CollectionLoop();
        collection.getElement();
        collection.displayElements();
    }
}
