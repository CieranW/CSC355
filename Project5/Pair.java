package Project5;

public class Pair<K, V> {
    private K key;
    private V val;

    public Pair(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return val;
    }

    public void setValue(V val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
        Pair<?, ?> other = (Pair<?, ?>) obj; // Type-safe cast
        return (key == null ? other.key == null : key.equals(other.key)) &&
            (val == null ? other.val == null : val.equals(other.val));
    }

    public String toString() {
        return "(key = " + key.toString() + ", value = " + val.toString() + ")";
    }

    public boolean isDeleted() {
        return key == null;
    }
}
