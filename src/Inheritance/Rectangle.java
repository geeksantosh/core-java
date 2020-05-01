package Inheritance;
/*Single level Inheritance*/
public class Rectangle {
        int length;
        int bredth;
    }

    class Area extends Rectangle {
    int area_result;
    public void calculate(){
    area_result = (length * bredth);
    System.out.println(area_result);
    }
}

