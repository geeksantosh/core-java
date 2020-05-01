package Inheritance;

public class Bike {
    public void bikeInfos(){
        System.out.println("This class for Multilevel Inheritance");
    }
}

class Brand extends Bike {
    public void brand(){
        System.out.println("Brand name is Yamaha");
    }

}
class MadeYear extends Brand {
    public void madeYear(){
        System.out.println("Made Year: 2019");
    }
}

class TopSpeed extends MadeYear{
    public void speed(){
        System.out.println("Top speed is: 120 KMps");
    }
}

class Insurance extends TopSpeed {
    public void insuranceType(){
        System.out.println("Full Insurance");
    }
}
