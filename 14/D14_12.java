import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class D14_12 {
    public static void main(String[] args) {
        Map<String, Fish> map = new TreeMap<String, Fish>();
        map.put("Tuna", new Fish("Tuna", 600));
        map.put("Salmon", new Fish("Salmon", 700));
        map.put("Shark", new Fish("Shark", 500));

        Set<String> keys = map.keySet();
        for (String key : keys) {
            Fish v = map.get(key);
            System.out.println (v.getName() + " " + v.getPrice());
        }
    }
}
