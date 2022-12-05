public class TreeData1 {
    public static Node getNode () {
        Node node1 = new Node("a");
        Node node2 = new Node("b");
        Node node3 = new Node("c");
        Node node4 = new Node("d");

        node1.set(node2, node4);
        node2.setLeft(node3);

        return node1;
    }
}
