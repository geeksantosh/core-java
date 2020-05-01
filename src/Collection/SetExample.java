package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    Set<Integer> setExample = new HashSet<Integer>();

    public void valuesInfo(){
        setExample.add(5);
        setExample.add(6);
        setExample.add(8);
        setExample.add(8);
    }
    public void printInfo(){
        for (int set : setExample){
            System.out.println(set);
        }
    }

    public static void main(String[] args) {
        SetExample printSetExample = new SetExample();
        printSetExample.valuesInfo();
        printSetExample.printInfo();
    }
}
