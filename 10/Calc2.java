import java.util.Stack;

public class Calc2 {
    private Stack<Integer> stack = new Stack<Integer>();

    public Calc2 () {

    }

    public void addToken (String s) {
        if (s.equals("+")) {
            int b = this.stack.pop();
            int a = this.stack.pop();
            this.stack.push (a + b);
        } else if (s.equals("-")) {
            int b = this.stack.pop();
            int a = this.stack.pop();
            this.stack.push (a - b);
        } else if (s.equals("*")) {
            int b = this.stack.pop();
            int a = this.stack.pop();
            this.stack.push (a * b);
        } else if (s.equals("/")) {
            int b = this.stack.pop();
            int a = this.stack.pop();
            this.stack.push (a / b);
        } else {
            int a = Integer.parseInt(s);
            this.stack.push(a);
        }
    }

    public int answer () {
        return this.stack.pop();
    }

    public boolean empty () {
        return this.stack.empty();
    }
}
