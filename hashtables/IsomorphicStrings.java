package hashtables;

import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string : ");
        String firstStr = sc.nextLine();

        System.out.print("Enter the second string : ");
        String secondStr = sc.nextLine();

        boolean areIsomorphic = isomophicStrgs(firstStr, secondStr);

        if (areIsomorphic)
            System.out.println("Strings are Isomorphic");
        else
            System.out.println("Not Isomorphic");

        sc.close();
    }

    public static boolean isomophicStrgs(String s, String t) {

        int[] indexS = new int[200];
        int[] indexT = new int[200];

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }

            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
