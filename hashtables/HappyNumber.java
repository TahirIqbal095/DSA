package hashtables;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 25;

        boolean isHappy = happyNum(n);

        if (isHappy) {
            System.out.println("Number is Happy");
        } else {
            System.out.println("Number is not Happy");
        }
    }

    public static boolean happyNum(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = sumOfSq(n);
        }

        return n == 1;
    }

    public static int sumOfSq(int n) {
        int sum = 0;

        while (n > 0) {
            int remainder = n % 10;
            sum += remainder * remainder;
            n /= 10;
        }

        return sum;
    }
}
