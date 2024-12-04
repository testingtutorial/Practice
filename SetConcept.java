import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {


    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("Testing1");
        set.add("Testing2");
        set.add("Testing3");
        set.add("Testing3");
        set.add("Testing4");
        set.add("Testing5");
        set.add("Testing5");

//        for(String i:set)
//        {
//            System.out.println(i);
//        }

        Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
