public class D7_K1 {
    public static void main(String[] args) {
        SingleCell season1 = new SingleCell ("�t");
        SingleCell season2 = new SingleCell ("��");
        SingleCell season3 = new SingleCell ("�H");
        SingleCell season4 = new SingleCell ("�~");
        season1.setNext (season2);
        season2.setNext (season3);
        season3.setNext (season4);
        season4.setNext (season1);

        print (season1, 6);
    }
    public static void print (SingleCell start, int size) {
        SingleCell season = start;
        for (int i = 0; i < size; i++) {
            System.out.println (i + " " + season.getData());
            season = season.getNext();
        }
    }
}
