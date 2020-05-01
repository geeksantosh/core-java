package Inheritance;

public class NewRectangle extends Polygon{
    public void area(){
        int area = length * breadth;
        System.out.println(area);
    }
    public void perimeter(){
        int perimeter = 2 * (length + breadth);
        System.out.println(perimeter);
    }
}
