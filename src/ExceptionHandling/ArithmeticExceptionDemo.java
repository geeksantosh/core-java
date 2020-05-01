package ExceptionHandling;
import java.util.*;
import java.lang.*;
public class ArithmeticExceptionDemo {
    float a = 0;
    float b = 0;
    float result;
    void getInputFromUser(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("------Enter First number:----- ");
            a = sc.nextFloat();
            System.out.println("-----Enter Second number-------");
            b = sc.nextFloat();
            result = a / b;
            System.out.println("Answer is: "+result);
        }catch (ArithmeticException ex){
            System.out.println("Only valid operation");
        }catch (InputMismatchException ex){
            System.out.println("Only Number is valid");

        }
    }


}
