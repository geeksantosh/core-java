package Inheritance;

public class NewSquare extends NewRectangle {
    public void area(){
        int area = length * breadth;
        System.out.println(area);
    }
    public void perimeter(){
        int peri = 4 * length;
        System.out.println(peri);
    }
}
