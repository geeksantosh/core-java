package Collection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class SearchOperation {
    int num = 0;
    List<String> stringData = new ArrayList<String>();

    public void getElementByUser(){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("How many elements do you want to enter ?");
        num = sc.nextInt(); }catch (InputMismatchException e){
            System.out.println("Only Integer number is valid input");
            System.exit(0);

        }
        System.out.println("Enter Elements data");
        for (int i = 0; i < num; i++){
        String nameData = sc.nextLine();
        stringData.add(nameData);

        }
    }
    public void displayElements(){
        for ( String s : stringData ) {
            System.out.println(s);
        }
    }

    public void SearchData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element Number to find data");
        try {
            int ElementNum = sc.nextInt();
            System.out.println("An element at " + ElementNum + " position: " + stringData.get(ElementNum));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index number is not exist");
            System.exit(0);
        }
    }
}
