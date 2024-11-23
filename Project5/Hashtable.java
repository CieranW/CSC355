package Project5;

@SuppressWarnings("unchecked")
public class Hashtable<K, V> {
    private Pair<K, V>[] table;
    private int n;// the number of key-value pairs in the table
    private int m;// the size of the table
    private double alphaHigh = 0.5;// resize if n/m exceeds this (1/2)
    private double alphaLow = 0.125;// resize if n/m goes below this (1/8)
    private static final Object DeletedKey = new Object();

    // constructor--default table size is 11
    public Hashtable() {
        n = 0;
        m = 11;
        table = new Pair[m];
    }

    // constructor
    public Hashtable(int m) {
        n = 0;
        this.m = m;
        table = new Pair[m];
    }

    // returns the value associated with key <key>
    // return null if key is not in table
    // do not forget that you will have to cast the result to (V)
    public V get(K key) {
        // TO BE IMPLEMENTED
        int index = Math.abs(key.hashCode()) % m;
        while (table[index] != null) {
            if (table[index].getKey().equals(key)) {
                return (V) table[index].getValue();
            }
            index = (index + 1) % m;
        }
        return null;
    }

    // puts (key, val) into the table or updates value
    // if the key is already in the table
    // resize to getNextNum(2*m) if (double)n/m exceeds alphaHigh after the insert
   
    public void put(K key, V value) {
        if (key == null) return;

        int index = Math.abs(key.hashCode()) % m;

        while (table[index] != null && (table[index].getKey().equals(DeletedKey) || !table[index].getKey().equals(key))) {
            index = (index + 1) % m;
        }
 
        if(table[index] == null){ //only increment n when its empty
            n++;
        }
 
        table[index] = new Pair<>(key, value);//noticed that you dont need to use set value but you can do this instead?
 
         if (((double) n / m) > alphaHigh) {
            resize(getNextNum(2 * m));
        }
    }

    // removes the (key, value) pair associated with <key>
    // returns the deleted value or null if the element was not in the table
    // resize to getNextNum(m/2) if m/2 >= 11 AND (double)n/m < alphaLow after the
    // delete
    public V delete(K key) {
 
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % m;
 
        while (table[index] != null) {
            if (table[index].getKey().equals(key) && !table[index].isDeleted()) {
                V deletedValue = (V) table[index].getValue();
                table[index] = new Pair<K, V>((K) DeletedKey, null);//set key to deletedKey and value to null
                n--;
 
                if ((m / 2 >= 11) && ((double)n/m < alphaLow)) {
                    resize(getNextNum(m / 2));
                }
 
                return deletedValue;
            }
        }
 
        return null; 
    }

    // return true if table is empty
    public boolean isEmpty() {
        // TO BE IMPLEMENTED
        return n == 0;
    }

    // return the number of (key,value) pairs in the table
    public int size() {
        // TO BE IMPLEMENTED
        return n;
    }

    // This method is used for testing only. Do not use this method yourself for any
    // reason
    // other than debugging. Do not change this method.
    public Pair<K, V>[] getTable() {
        return table;
    }

    // PRIVATE

    // gets the next multiple of 6 plus or minus 1,
    // which has a decent probability of being prime.
    // Use this method when resizing the table.
    private int getNextNum(int num) {
        if (num == 2 || num == 3) {
            return num;
        }
        int rem = num % 6;
        switch (rem) {
            case 0:
                num++;
                break;
            case 2:
                num += 3;
                break;
            case 3:
                num += 2;
                break;
            case 4:
                num++;
                break;
        }
        return num;
    }

    // resizes the table to the new capacity
    private void resize(int newCapacity) {
        Pair<K, V>[] newTable = new Pair[newCapacity];
        Pair<K, V>[] oldTable = table; // Save the old table
        m = newCapacity; // Update the table size
 
        for (Pair<K, V> pair : oldTable) {
            if (pair != null && !pair.isDeleted() && !pair.getKey().equals(DeletedKey)) {
                int hashCode = Math.abs(pair.getKey().hashCode());
                int index = hashCode % m;
 
                while (newTable[index] != null) {
                    index = (index + 1) % m;
                }
 
                newTable[index] = pair;
                n++;
            }
        }
 
        // Update the table to the new table
        table = newTable;
    }
}
