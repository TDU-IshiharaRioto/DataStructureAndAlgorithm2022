public class D4_1 {
    public static void main(String[] args) {
        PostList postList = new PostList();
        postList.add (new Post (120, "Tokyo"));
        postList.add (new Post (270, "Chiba"));
        postList.add (new Post (350, "Saitama"));
        postList.add (new Post (400, "Yamanashi"));
        postList.add (new Post (600, "Kyoto"));
        postList.add (new Post (700, "Okayama"));
        print (search (postList, 270));

    }
    public static Post search (PostList postList, int key) {
        int low = 0;
        int high = postList.size () - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            Post post = postList.get (middle);
            int code = post.getCode ();
            if (key == code) {
                return post;
            } else if (key < code) {
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
