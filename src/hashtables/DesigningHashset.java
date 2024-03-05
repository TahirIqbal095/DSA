package hashtables;

import java.util.List;

public class DesigningHashset {
    public static void main(String[] args) {
        
    }
}

class MyHashset {
    private List<Integer>[] buckets;
    private int capacity;

    public boolean contains(int key) {
        int index = getIndex(key);
        List<Integer> bucket = buckets[index];
        return bucket != null && bucket.contains(key);

    }

    private int getIndex(int key) {
        return key % capacity;
    }

}