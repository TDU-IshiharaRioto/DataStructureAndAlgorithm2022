public class D11_2 {
    public static void main(String[] args) {
        Node node1 = new Node("*");
        Node node2 = new Node("+");
        Node node3 = new Node("a");
        Node node4 = new Node("b");
        Node node5 = new Node("-");
        Node node6 = new Node("c");
        Node node7 = new Node("d");

        node1.set(node2, node5);
        node2.set(node3, node4);
        node5.set(node6, node7);

        TraverserUtils.printAll(node1);
    }
}
