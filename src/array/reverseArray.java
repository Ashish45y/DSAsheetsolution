package array;

import java.util.*;
public class reverseArray {

    /**
     *
     * @que - Reverse the array.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            int element = sc.nextInt();
            arr[i] = element;
        }
        System.out.println("reverse array:-"+ Arrays.toString(reverseArr(arr, n)));
    }
    public static int[] reverseArr(int [] arr, int n){
        int start = 0;
        int end = n-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
