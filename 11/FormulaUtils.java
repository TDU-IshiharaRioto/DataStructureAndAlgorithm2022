import java.util.List;

public class FormulaUtils {
    public static Calculator calculate (List<Object> list) {
        Calculator calculator = new Calculator();
        for (Object object : list) {
            calculator.addToken(object.toString());
        }
        return calculator;
    }

    public static void print (Node node) {
        System.out.print ("Formula:");
        Traverser traverser = new Traverser(Order.POSTORDER);
        traverser.print(node);
        Calculator calculator = calculate (traverser.getList(node));
        System.out.println ("Answer:" + calculator.answer());
        System.out.println ("Stack empty:" + calculator.empty());
    }
}
