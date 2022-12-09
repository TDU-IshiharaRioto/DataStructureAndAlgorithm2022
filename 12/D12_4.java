public class D12_4 {
    public static void main(String[] args) {
        PostAddressTreeMap map = new PostAddressTreeMap();
        map.put(new Post(120, "Tokyo"));
        map.put(new Post(270, "Chiba"));
        map.put(new Post(350, "Saitama"));

        System.out.println ("sort address");
        for (String key : map.keySet()) {
            Post post = map.get(key);
            PostManager pm = new PostManager(post);
            System.out.println (pm.getString());
        }
    }
}
