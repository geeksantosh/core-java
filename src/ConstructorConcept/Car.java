package ConstructorConcept;

public class Car {
    String brand_name;
    int model;
    int hz_power;

    public void PrintDetails(){
        System.out.println("Details of "+ brand_name+ " Model is "+ model+ " Horse Power is "+ hz_power );
    }

    public Car(String b, int m, int power) {
        brand_name = b;
        model = m;
        hz_power = power;
    }

}
