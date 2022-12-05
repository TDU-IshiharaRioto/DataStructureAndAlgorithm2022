public class D10_K1 {
    public static void main(String[] args) {
        String[] fs = {"25", "5", "+", "2", "*", "3", "/", "4", "-"};

        Calc2 calc2 = new Calc2();
        System.out.print ("Formula:");
        for (String s: fs) {
            calc2.addToken(s);
            System.out.print (s + " ");
        }

        System.out.println ();
        System.out.println ("Answer:" + calc2.answer());
        System.out.println ("Stack empty:" + calc2.empty());
    }
}
