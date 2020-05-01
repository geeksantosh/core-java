//Program to learn HashMap

package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ExampleByTeacherHashMap {
        Map<String, String> stringMap = new HashMap<String, String>();
        public void getElement() {
            stringMap.put("Nepal", "Ktm");
            stringMap.put("India", "Del");
            stringMap.put("USA", "Washington");
            stringMap.put("Maldipes", "Male");


        }

        public void displayElements() {
            System.out.println("The all Strings Are ---------------------->>>>");
            for (String key :stringMap.values()){
                System.out.println(key);
            }

        }
        public void searchElement() {
            System.out.println("Searching  City Is ---------------->>>>>>>:");
            String country = stringMap.get("Nepal");
            System.out.println(country);
        }

    public static void main(String[] args) {
        ExampleByTeacherHashMap stringMap = new ExampleByTeacherHashMap();
        stringMap.getElement();
        stringMap.displayElements();
        stringMap.searchElement();
    }
}

