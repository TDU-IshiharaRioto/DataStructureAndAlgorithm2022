public class debug {
    public static void main(String[] args) {
        SnackList snackList = new SnackList();
        snackList.add (new Snack("�`���R���[�g", 200));
        snackList.add (new Snack("�N�b�L�[", 100));
        snackList.add (new Snack("�L�����f�B�[", 300));

        for (int i = 0; i < snackList.size(); i++) {
            System.out.println (snackList.get(i).getName());
            System.out.println (snackList.get(i).getPrice());
        }
        String key = "�L�����f�B�[";

        for (int i = 0; i < snackList.size(); i++) {
            if (snackList.get(i).equals(key)) {
                snackList.get(i).getName();
            }
        }
        
    }
}
