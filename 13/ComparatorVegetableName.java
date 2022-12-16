import java.util.Comparator;

public class ComparatorVegetableName implements Comparator<Vegetable> {
    @Override
    public int compare (Vegetable vegetable1, Vegetable vegetable2) {
        return vegetable1.getName().compareTo(vegetable2.getName());
    }
}
