package array;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3};
        System.out.println(doUnion(a, b));
        System.out.println(doIntersection(a, b));


    }

    public static int doUnion(int[] a, int[] b) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hashSet1.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            hashSet1.add(b[i]);
        }
        return hashSet1.size();
    }

    public static int doIntersection(int[] a, int[] b) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            h1.add(a[i]);
        }
        for (int x : b) {
            if (h1.contains(x)) {
                h2.add(x);
            }
        }
        return h2.size();
    }
}
