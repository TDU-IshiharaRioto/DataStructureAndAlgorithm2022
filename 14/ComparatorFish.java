import java.util.Comparator;

public class ComparatorFish implements Comparator<Fish> {
    @Override
    public int compare (Fish fish1, Fish fish2) {
        return fish1.getPrice() - fish2.getPrice();
    }
}
