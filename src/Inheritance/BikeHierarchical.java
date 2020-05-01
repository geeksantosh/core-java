package Inheritance;
/*Example of Hierarchical Inheritance*/
public class BikeHierarchical {
    public void bike(){
        System.out.println("This class for Hierarchical Inheritance ");
    }
}

class BrandName extends BikeHierarchical {
    public void brandName(){
        System.out.println("Brand Name: Yamaha");
    }
}
class ModelName extends BrandName{
    public void modelName(){
        System.out.println("Model Name is: FZS v2");
    }
}
class HighestSpeed extends BikeHierarchical{
    public void fastestSpeed(){
        System.out.println("Fastest Speed: 111KMps");
    }
}
class MakeYear extends BikeHierarchical{
    public void bikeMakeyear(){
        System.out.println("Make Year: 2018");
    }
}
class MakeMonth extends  MakeYear{
    public void madeMonth(){
        System.out.println("Made Month: December");
    }
}
