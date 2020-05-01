package Collection;

import java.util.ArrayList;
import java.util.*;
public class ListMethod {
    //String strArr[] = new String[5];
    int num = 0;
    ArrayList<String> stringList = new ArrayList<String>();

    public void getElement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your desire elements number");
        num = sc.nextInt();
        System.out.println("*******Enter Elements********");

        for (int i = 0; i <= num; i++){
            String element = sc.nextLine();
            stringList.add(element);
        }

        String term = "santosh";
        System.out.println("the list contains ( " + term + " ) = " + find(term));
    }

    public void displayElements(){
        for (String s : stringList){
            System.out.println(s);
        }
    }

    public int find(String term){

        int resultingIndex = -1;

        for (int i = 0; i < stringList.size(); i++) {

            System.out.println(i + " " + stringList.get(i));

            if(term.equals(stringList.get(i))) {
                resultingIndex = i;
                break;
            }

        }

//        for (String s :
//                stringList) {
//            if(term.equals(s)) {
//                resultingIndex = stringList.indexOf(s);
//            }
//        }

       return resultingIndex;
    }
}
