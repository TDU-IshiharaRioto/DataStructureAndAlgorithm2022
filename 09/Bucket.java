public class Bucket {
    private String key;
    private Object data;
    private BucketStatus status = BucketStatus.EMPTY;
    
    public Bucket () {

    }

    public void setKeyData (String key, Object data) {
        this.key = key;
        this.data = data;
        this.status = BucketStatus.USE;
    }

    public String getKey () {
        return this.key;
    }

    public Object getData () {
        return this.data;
    }

    public boolean isEmpty () {
        if (this.status == BucketStatus.EMPTY) {
            return true;
        }
        return false;
    }

    public boolean isUse () {
        if (this.status == BucketStatus.USE) {
            return true;
        }
        return false;
    }

    public boolean isRemoved () {
        if (this.status == BucketStatus.REMOVED) {
            return true;
        }
        return false;
    }

    public void remove () {
        this.status = BucketStatus.REMOVED;
    }

    public String getString () {
        return this.key + " " + this.data.toString();
    }
}
