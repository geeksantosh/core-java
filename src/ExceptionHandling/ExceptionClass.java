package ExceptionHandling;
import java.util.Scanner;
import java.util.*;
public class ExceptionClass {
float radius = 0;
float result;


void getInputFromUser(){
    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        radius = sc.nextFloat();
        result = (float) ((4.0 / 3.0) * Math.PI * (radius * radius * radius));
        System.out.println(result);
    } catch (InputMismatchException ex) {
        System.out.println("Only Number input is valid");
    }
}
}
