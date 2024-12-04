import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {


    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Name1", "Test1");
        map.put("Name2","Test2");
        map.put("Name3", "Test3");

        System.out.println(map.keySet());
        System.out.println(map.values());

        for(Map.Entry<String, String> m: map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
