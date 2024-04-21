package hashtables;

import java.util.HashMap;

public class FirstUniqueElement {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int c = uniqueElement(s);
        System.out.println(c);
    }

    /**
     * using hashmap
     * time complexity : O(n)
     * space complexity : O(n)
     */
    public static int uniqueEl(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int j = 0; j < s.length(); j++) {
            if (map.get(s.charAt(j)) == 1)
                return j;
        }
        return -1;
    }

    /**
     * using the hashing
     * Tc - O(n)
     * Sp - O(26) 26 is the size of array of characters
     */

    public static int uniqueElement(String s) {

        int[] chars = new int[26];

        for (char ch : s.toCharArray()) {
            chars[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
