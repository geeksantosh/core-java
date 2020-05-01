package ExceptionHandling;
import java.util.*;
import java.lang.*;
public class StudentInfomation {
    String name = "";
    String Address = "";
    int class_level = 0;
    int roll = 0;

void getInputFromUser(){
    Scanner sc = new Scanner(System.in);
    try {
        System.out.println("Enter Student Name: ");
        name = sc.nextLine();
        System.out.println("Enter Address: ");
        Address = sc.nextLine();
        System.out.println("Class level: ");
        class_level = sc.nextInt();
        System.out.println("Enter Roll Number: ");
        roll = sc.nextInt();
        System.out.println("Name: "+name);
        System.out.println("Address: "+Address);
        System.out.println("Class: "+class_level);
        System.out.println("Roll No: "+roll);
    }catch (InputMismatchException ex){
        System.out.println("Only Integer value");
    }

}

    public static void main(String[] args) {
        StudentInfomation stuinfo = new StudentInfomation();
        stuinfo.getInputFromUser();


    }
}
