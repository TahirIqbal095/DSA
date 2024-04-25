package hashtables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> list = anagrams(strs);

        for (List<String> ls : list) {
            System.out.print(ls);
        }
    }

    public static List<List<String>> anagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        for (String str : strs) {
            String sortedStr = sort(str);
            insertValues(map, sortedStr, str);
        }

        for (String key : map.keySet()) {
            ArrayList<String> anagrams = map.get(key);
            list.add(anagrams);
        }
        return list;
    }

    public static String sort(String s1) {
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void insertValues(Map<String, ArrayList<String>> map, String key, String value) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
}
