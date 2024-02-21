package array;

import java.util.*;

public class SortedArray012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }
        System.out.println("Sorted Array are->"+ Arrays.toString(sortedArray(arr, n)));

    }

    public static int[] sortedArray(int[] arr, int n) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0, i;
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i = 0;
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

     return arr;
    }
}
