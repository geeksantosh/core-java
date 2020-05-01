package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    Map<String, String> addressMapping = new HashMap<>();

    public void putInfo(){
        addressMapping.put("Ram", "Kathmandu");
        addressMapping.put("Sita", "Janakpur");
        addressMapping.put("Laxman", "Ayodhya");

        System.out.println("userCityMapping HashMap : " + addressMapping);

        // To find the size of a HashMap
        System.out.println("We have the information as follows: "+ addressMapping.size() );

    }
    public void userValidation(){
        String userName = "Sita";
    //To validate the data exists or not

        if (addressMapping.containsKey(userName)){
            String city = addressMapping.get(userName);
            System.out.println(userName +" Lives in "+ city);
        }else{
            System.out.println("Location information not found for "+ userName);
        }
    }

    public static void main(String[] args) {
        HashMapExample hashMapExample = new HashMapExample();
        hashMapExample.putInfo();
        hashMapExample.userValidation();
    }
}
