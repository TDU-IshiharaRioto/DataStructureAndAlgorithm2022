import java.util.Comparator;

public class ComparatorSnackName implements Comparator<Snack> {
    public int compare (Snack snack1, Snack snack2) {
        return snack1.getName().compareTo(snack2.getName());
    }
}
