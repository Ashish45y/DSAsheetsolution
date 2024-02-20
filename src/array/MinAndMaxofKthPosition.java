package array;

import java.util.*;

public class MinAndMaxofKthPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];//[2,6,1,4,8,9] = k =3  min =6 max=6
        for(int i = 0; i<n; i++){
            int element = sc.nextInt();
            arr[i] = element;
        }
        System.out.println("Minimum kth element:"+MinKthPosition(arr,n,k));
        System.out.println("Maximum kth element:"+MaxKthPosition(arr,n,k));
    }
    public static int MinKthPosition(int[] arr,int n,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<n;i++){
            pq.offer(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static int MaxKthPosition(int[] arr,int n,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int i = 0;i<n;++i){
           pq.offer(arr[i]);
           if(pq.size()>k){
               pq.poll();
           }
       }
       return pq.peek();
    }
}
