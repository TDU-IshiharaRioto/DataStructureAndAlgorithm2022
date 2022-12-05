public class D5_K1 {
    public static void main(String[] args) {
        String[] snacks = {"チョコレート", "クッキー", "キャンディー", "ポテトチップ", "ビスケット"};
        print (snacks);
        System.out.println ("sort");
        sort (snacks);
        print (snacks);
    }
    public static void sort (String[] a) {
        int index = a.length;
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index - 1; j++) {
                String v1 = a[j];
                String v2 = a[j + 1];
                if (v1.compareTo(v2) > 0) {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static void print (String[] a) {
        for (String value : a) {
            System.out.print (value + " ");
        }
        System.out.println ();
    }
}
