package Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    Set<Integer> sequenceByTreeSet = new TreeSet<Integer>();

    void getInfo(){
        sequenceByTreeSet.add(6);
        sequenceByTreeSet.add(10);
        sequenceByTreeSet.add(1);
        sequenceByTreeSet.add(12);
        sequenceByTreeSet.add(19);
        sequenceByTreeSet.add(17);
        sequenceByTreeSet.add(20);

    }
    void displayInfo(){
        for (int result : sequenceByTreeSet){
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        TreeSetExample setBySequence = new TreeSetExample();
        setBySequence.getInfo();
        setBySequence.displayInfo();
    }
}
