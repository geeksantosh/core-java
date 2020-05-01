package MathFunction;
import java.util.Scanner;
public class FindMaxnumber {
    int a;
    int b;

    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------Enter Numbers----------------");
        a = sc.nextInt();
        b = sc.nextInt();

    }

    void maxResult(){
        System.out.println("Max number is "+ Math.max(a, b));
    }
}
