public class D3_K1 {
    public static void main (String[] args) {
        SnackList snackList = new SnackList();
        snackList.add (new Snack("�`���R���[�g", 200));
        snackList.add (new Snack("�N�b�L�[", 100));
        snackList.add (new Snack("�L�����f�B�[", 300));

        String key = "�L�����f�B�[";
        Snack snack = search(snackList, key);
        print (snack);
    }
    public static Snack search (SnackList snackList, String key) {
        for (int i = 0; i < snackList.size(); i++) {
            if (snackList.get(i).getName().equals(key)) {
                return snackList.get(i);
            }
        }
        return null;
    }
    public static void print (Snack snack) {
        System.out.println (snack.getName() + " " + snack.getPrice());
    }
}
