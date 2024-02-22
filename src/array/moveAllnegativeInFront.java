package array;

import java.util.*;

public class moveAllnegativeInFront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            int element = sc.nextInt();
            arr[i] = element;
        }
        System.out.println("sorted array->"+ Arrays.toString(reArrangeArray(arr, n)));
    }
    public static int[] reArrangeArray(int[] arr,int n){
        int j=0 , temp;
        for(int i = 0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
}
