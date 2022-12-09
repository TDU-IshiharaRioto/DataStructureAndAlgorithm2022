import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PostAddressTreeMap {
    private Map<String, Post> map = new TreeMap<String, Post>();

    public PostAddressTreeMap () {

    }

    public void put (Post post) {
        this.map.put(post.getAddress(), post);
    }

    public Post get (String key) {
        return this.map.get(key);
    }

    public Set<String> keySet () {
        return this.map.keySet();
    }
}
