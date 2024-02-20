package array;

import java.util.*;

public class MaxandMinInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            int element = sc.nextInt();
            arr[i] = element;
        }
        System.out.println("Maximum in the Array:"+ MaxInArray(arr,n));
        System.out.println("Minimum in the Array:"+ MinInArray(arr,n));

    }
    public static int MaxInArray(int[] arr,int n){
        int max = arr[0];
        for (int i = 0; i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int MinInArray(int[] arr, int n){
        int min = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
