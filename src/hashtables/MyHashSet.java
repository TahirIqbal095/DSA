package hashtables;

import java.util.LinkedList;

public class MyHashSet {
    private static final int SIZE = 1000;
    public LinkedList<Integer>[] bucket;

    @SuppressWarnings("unchecked")
    public MyHashSet() {
        bucket = new LinkedList[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void insert(int key) {
        int index = hash(key);

        if (bucket[index] == null) {
            bucket[index] = new LinkedList<>();
        }

        if (!bucket[index].contains(key)) {
            bucket[index].add(key);
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        return bucket[index].contains(key) && bucket[index] != null;
    }

    public void remove(int key) {
        int index = hash(key);
        if (bucket[index] == null) {
            System.out.println("key doesn't exist");
        }

        if (bucket[index].contains(key)) {
            bucket[index].remove(Integer.valueOf(key));
        }
    }

    public void show() {
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] != null) {
                for (Integer num : bucket[i]) {
                    System.out.print(num + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        MyHashSet set = new MyHashSet();

        set.insert(10);
        set.insert(11);
        set.insert(1010);
        set.insert(2010);
        set.insert(4011);

        set.show();
    }
}
