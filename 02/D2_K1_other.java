public class D2_K1_other {
    /*
     * こちらの解答でも良い。
     */
    public static void main(String[] args) {
        /*
         * SnackListオブジェクトを作成
         */
        SnackList snackList = new SnackList();

        /*
         * SnackListオブジェクトである、snackListに入れるSnackオブジェクトを3つ作る。
         */
        Snack snack1 = new Snack ("チョコレート", 200);
        Snack snack2 = new Snack ("クッキー", 100);
        Snack snack3 = new Snack ("キャンディー", 300);

        /*
         * Snackオブジェクト3つを、SnackListオブジェクトである、snackListに入れる
         */
        snackList.add(snack1);
        snackList.add(snack2);
        snackList.add(snack3);

        /*
         * printメソッドを呼び出して、snackListを渡す
         */
        print (snackList);
    }

    public static void print (SnackList snackList) {
        /*
         * 引数（ひきすう）の、snackListから、Snackオブジェクトを取り出す
         * 取り出したSnackオブジェクトは、変数に入れておかなければ消えてしまうので、入れる受け皿を用意する
         */
        Snack snack1 = snackList.get(0);
        Snack snack2 = snackList.get(1);
        Snack snack3 = snackList.get(2);

        /*
         * 取り出したそれぞれのSnackオブジェクトから、nameと、priceを取り出して、受け皿に入れる
         */
        String name1 = snack1.getName();
        int price1 = snack1.getPrice();
        String name2 = snack1.getName();
        int price2 = snack2.getPrice();
        String name3 = snack3.getName();
        int price3 = snack3.getPrice();

        /*
         * 取り出したnameとpriceを表示する
         */
        System.out.println (name1 + " " + price1);
        System.out.println (name2 + " " + price2);
        System.out.println (name3 + " " + price3);
    }
}

/*
 * 実行結果は次の通り
 * C:\java>java D2_K1
 * チョコレート 200
 * クッキー 100
 * キャンディー 300
 */

 /*
  * 同じ作業を繰り返していることに着目して、for文を使うなど、プログラムの工夫をすれば、行数の削減につながる。
  * このような、長いプログラムを動作内容を変えることなく、短くすることをリファクタリングという。
  */