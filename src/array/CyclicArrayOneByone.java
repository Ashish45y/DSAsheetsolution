package array;

import java.util.*;

public class CyclicArrayOneByone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arr[i] = element;
        }
        System.out.println("reverse cyclic Array:-"+ Arrays.toString(cyclicReverseArray(arr, n)));
    }
    public static int[] cyclicReverseArray(int[] arr, int n){
        int i = 0, j = n-1;
       while (i!=j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
       }
       return arr;
    }
}

