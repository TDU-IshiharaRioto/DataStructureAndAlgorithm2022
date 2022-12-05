public class debug {
    public static void main(String[] args) {
        SnackList snackList = new SnackList();
        snackList.add (new Snack("チョコレート", 200));
        snackList.add (new Snack("クッキー", 100));
        snackList.add (new Snack("キャンディー", 300));

        for (int i = 0; i < snackList.size(); i++) {
            System.out.println (snackList.get(i).getName());
            System.out.println (snackList.get(i).getPrice());
        }
        String key = "キャンディー";

        for (int i = 0; i < snackList.size(); i++) {
            if (snackList.get(i).equals(key)) {
                snackList.get(i).getName();
            }
        }
        
    }
}
