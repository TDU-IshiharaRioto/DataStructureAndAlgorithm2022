import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D14_3 {
    public static void main(String[] args) {
        List<Vegetable> list = new ArrayList<Vegetable>();
        list.add(new Vegetable("Pumpkin", 50));
        list.add(new Vegetable("Cucumber", 90));
        list.add(new Vegetable("Radish", 80));

        Comparator<Vegetable> c = new ComparatorVegetableName();
        Collections.sort(list, c);
        for (Vegetable v : list) {
            System.out.println (v.getName() + " " + v.getPrice());
        }
    }
}
