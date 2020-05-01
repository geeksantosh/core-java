package Collection;

import java.util.*;

public class StringCollection {
    String dtrArr[] = new String[5]; //Array

    List<String> stringList = new ArrayList<String>(); //List

    Set<String> stringSet = new HashSet<String>(); //Set

    public void getElements(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five data element");
        for (int i = 0; i<5; i++){
            dtrArr[i] = sc.nextLine(); //Array

            stringList.add(sc.nextLine());  //List
            stringSet.add(sc.nextLine()); //set
        }
    }
        public void displayElements(){
            for (int i = 0; i < 5; i++){
                System.out.println(dtrArr[i]); //Array

                System.out.println(stringList.get(i)); //List

            }
        }

}
