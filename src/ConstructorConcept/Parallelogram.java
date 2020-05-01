package ConstructorConcept;

public class Parallelogram {
    int breadth;
    int height;
    public void parallelogramCalc(){
        int area = breadth * height;
        System.out.println("Area of Parallelogram is: "+ area);
    }

    public Parallelogram (int b, int h){ //Constructor definition;
        breadth = b;
        height = h;
    }
}
