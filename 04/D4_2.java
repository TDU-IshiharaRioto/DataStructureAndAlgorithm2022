public class D4_2 {
    public static void main (String[] args) {
        PostList postList = new PostList();
        postList.add (new Post (270, "Chiba"));
        postList.add (new Post (600, "Kyoto"));
        postList.add (new Post (700, "Okayma"));
        postList.add (new Post (350, "Saitama"));
        postList.add (new Post (120, "Tokyo"));
        postList.add (new Post (400, "Yamanashi"));
        print (search (postList, "Tokyo"));
    }
    public static Post search (PostList postList, String key) {
        int low = 0;
        int high = postList.size() - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            Post post = postList.get(middle);
            String address = post.getAddress();
            if (key.compareTo(address) == 0) {
                return post;
            } else if (key.compareTo(address) < 0) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return null;
    }
    public static void print (Post post) {
        System.out.println ("code:" + post.getCode() + " address:" + post.getAddress());
    }
}
