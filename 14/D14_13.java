import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D14_13 {
    public static void main(String[] args) {
        List<Fish> list = new ArrayList<Fish>();
        list.add(new Fish("Cod", 700));
        list.add(new Fish("Sardine", 100));
        list.add(new Fish("Bonito", 500));

        Comparator<Fish> c = new ComparatorFish();
        Collections.sort(list, c);
        for (Fish v : list) {
            System.out.println (v.getName() + " " + v.getPrice());
        }
    }
}
