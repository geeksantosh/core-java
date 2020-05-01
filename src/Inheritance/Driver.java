package Inheritance;

public class Driver {
    public static void main(String[] args) {
        Area area = new Area();/*For Single Level Inheritance*/
        area.calculate();

        System.out.println();/*Line space*/

        /*For Multilevel Inheritance example*/
        Insurance bike = new Insurance();
        bike.bikeInfos();
        bike.brand();
        bike.madeYear();
        bike.speed();
        bike.insuranceType();

        System.out.println();/*Line space*/
//Hierarchical Inheritance
        BikeHierarchical newBike = new BikeHierarchical();
        newBike.bike();
        ModelName mn = new ModelName();
        mn.brandName();
        mn.modelName();
        HighestSpeed highestSpeed =new HighestSpeed();
        highestSpeed.fastestSpeed();
        MakeMonth makeMonth = new MakeMonth();
        makeMonth.bikeMakeyear();
        makeMonth.madeMonth();

        //Method overriding
        NewRectangle nr = new NewRectangle();
        nr.area();
        nr.perimeter();
        NewSquare newSquare = new NewSquare();
        newSquare.area();
        newSquare.perimeter();

    }


}
