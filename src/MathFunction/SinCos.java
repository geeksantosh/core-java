package MathFunction;
import java.lang.Math;
import java.util.Scanner;
public class SinCos {
    double a;

    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Enter the Value of A variable:-------------- ");
        a = sc.nextInt();
    }
    void printResult(){
        System.out.println("Cos of "+ a +" is "+ Math.cos(a) );
        System.out.println("Sin of "+ a + " is "+ Math.cos(a));
    }
}
