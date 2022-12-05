public class D2_K1 {
    public static void main(String[] args) {
        SnackList snackList = new SnackList();
        String[] name = {"チョコレート", "クッキー", "キャンディー"};
        int[] price = {200, 100, 300};
        for (int i = 0; i < 3; i++) {
            snackList.add(new Snack(name[i], price[i]));
        }
        print (snackList);
    }
    public static void print (SnackList snackList) {
        for (int i = 0; i < snackList.size(); i++) {
            Snack temp = snackList.get(i);
            System.out.println (temp.getName() + " " + temp.getPrice());
        }
    }
}
