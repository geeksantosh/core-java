package MathFunction;

import Abstraction.Square;

public class Driver {
    public static void main(String[] args) {
        //Power
        MathPower power = new MathPower();
        power.myPower();
        //Log
        Log log = new Log();
        log.findLog();
        //Max Number
        FindMaxnumber findMaxnumber = new FindMaxnumber();
        findMaxnumber.getInput();
        findMaxnumber.maxResult();
        //sinCos
        SinCos sinCos = new SinCos();
        sinCos.getInput();
        sinCos.printResult();
        //Square Root
        SquareRoot squareRoot = new SquareRoot();
        squareRoot.getInputFromUser();
        squareRoot.displayResult();
        //Volume of Sphere;
       VolumeSphere volumeSphere = new VolumeSphere();
        volumeSphere.getInputFromUsers();
        volumeSphere.getCalculation();

    }
}
