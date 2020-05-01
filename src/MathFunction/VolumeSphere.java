package MathFunction;
import java.util.Scanner;
import java.lang.Math;
public class VolumeSphere {
    double radius = 0;

    void  getInputFromUsers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius ");
        radius = sc.nextInt();
    }
    void getCalculation(){

        double volume = (4.0/3.0)*Math.PI*(radius*radius*radius);
        System.out.println("Volume of Sphere "+radius +" is " +volume);
    }





}
