import java.util.*;

public class D14_2 {
    public static void main(String[] args) {
        Map<String, Vegetable> map = new TreeMap<String, Vegetable>();
        map.put("Onion", new Vegetable("Onion", 70));
        map.put("Tomato", new Vegetable("Tomato", 60));
        map.put("Potato", new Vegetable("Potato", 50));
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Vegetable v = map.get(key);
            System.out.println (v.getName() + " " + v.getPrice());
        }

    }
}
