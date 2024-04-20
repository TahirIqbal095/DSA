package hashtables;

public class FirstUniqueElement {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int c = uniqueEl(s);
        System.out.println(c);
    }

    public static int uniqueEl(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            int count = 0;
            char c = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j))
                    count++;
            }
            if (count == 0)
                return i;
        }
        return -1;
    }
}
