package hashtables;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/*
 * intersection of two arrays means the common
 * elements between the two arrays, example : 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 */

public class IntersectionOfArrays {
    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 4 };
        int[] arr2 = { 2, 3, 3, 4 };

        LinkedList<Integer> res = intersection(arr1, arr2);

        Iterator<Integer> it = res.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public static LinkedList<Integer> intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        LinkedList<Integer> list = new LinkedList<>();

        for (Integer num : nums1) {
            set.add(num);
        }

        for (Integer num : nums2) {
            if (set.contains(num)) {
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }

        return list;
    }
}
