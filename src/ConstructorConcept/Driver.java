package ConstructorConcept;

public class Driver {
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(10, 5);
        parallelogram.parallelogramCalc();

        System.out.println();

        Car carDetails = new Car("Toyota", 800, 5455555 );
        carDetails.PrintDetails();

        System.out.println();

        PersonDetails personDetails = new PersonDetails("Ram", "Thapa", "Kathmandu Nepal", "test@gmail.com",123456789);
        personDetails.printData();



    }
}
