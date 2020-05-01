package MathFunction;
import java.util.Scanner;
import java.lang.Math;
public class SquareRoot {
    double sqr;

    void getInputFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------Enter number to find Square Root: ----------------");
        sqr = sc.nextInt();
    }
    void displayResult(){
        System.out.println("Square of "+sqr +" is: "+ Math.sqrt(sqr));
    }
}
