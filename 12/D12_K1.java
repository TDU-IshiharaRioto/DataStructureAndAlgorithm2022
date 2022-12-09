import java.util.TreeMap;
import java.util.Map;

public class D12_K1 {
    public static void main(String[] args) {
        Map<String, Snack> map = new TreeMap<String, Snack>();
        map.put("�`���R���[�g", new Snack("�`���R���[�g", 200));
        map.put("�N�b�L�[", new Snack("�N�b�L�[", 100));
        map.put("�L�����f�B�[", new Snack("�L�����f�B�[", 300));
        map.put("�i�b�c", new Snack("�i�b�c", 120));
        map.put("�|�e�g�t���C", new Snack("�|�e�g�t���C", 180));

        System.out.println ("sort name");
        for (String key : map.keySet()) {
            Snack snack = map.get(key);
            SnackManager sm = new SnackManager(snack);
            System.out.println (sm.getString());
        }
    }
}
