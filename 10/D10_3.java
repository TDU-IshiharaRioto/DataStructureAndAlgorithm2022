public class D10_3 {
    public static void main(String[] args) {
        String[] fs = {"3", "4", "+"};

        Calc calc = new Calc();
        System.out.print ("Formula:");
        for (String s: fs) {
            calc.addToken(s);
            System.out.print (s + " ");
        }
        System.out.println ();
        System.out.println ("Answer:" + calc.answer());
        System.out.println ("Stack empty:" + calc.empty());
    }
}
