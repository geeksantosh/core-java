package Collection;
import java.util.HashSet;
import java.util.Set;

public class SetExampleString {
    Set<String> stringSet = new HashSet<>();

    public void setInfo(){
        stringSet.add("Ram");
        stringSet.add("Sita");
        stringSet.add("Hari");
        stringSet.add("Hello World");
        System.out.println(stringSet.add("Ram"));
        stringSet.add("Hari");
    }

    public void displayInfo(){
        for (String stringLoop : stringSet){
            System.out.println(stringLoop);
        }

    }

    public static void main(String[] args) {
        SetExampleString displayInfoStringData = new SetExampleString();
        displayInfoStringData.setInfo();
        displayInfoStringData.displayInfo();
    }
}
