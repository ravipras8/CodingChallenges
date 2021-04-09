package Test;

import java.util.Arrays;
import java.util.Collections;

import com.google.common.primitives.Ints;

public class Solution {

    public static void main(String[] args) {
        int[] arr ={497978859,167261111,483575207,591815159};
    //     int[] arr ={1000000000};
    //    System.out.println(new Solution().maxProfit(arr, 1000000000));
       System.out.println(new Solution().maxProfit(arr, 836556809));
    }

    public int maxProfit(int[] inventory, int orders) {
        long sum =0;
        long start,end;
        start = System.currentTimeMillis();
        int arr[] = sortInventory(inventory);
        // Arrays.sort(inventory, Collections.reverseOrder());
        // Collections.reverse(Arrays.asList(inventory));
        // int arr[] = inventory;
        for(int count = 1,i=0; count <= orders; count++){
            sum += arr[i]--;
            // sum = sum%1000000007;
            // if(arr.length>1){
            while(i < arr.length-1 && arr[i] < arr[i+1]){
                i++;
            }
            while(i > 0 && arr[i-1] >= arr[i]){
                i--;
            }
        // }
        }
        end = System.currentTimeMillis();
        System.out.println((end-start));
        return (int)(sum%1000000007);
    }
    
    public int[] sortInventory(int[] inventory){
        for(int i=0; i < inventory.length; i++){
            for(int j=0; j< inventory.length-i-1; j++){
                if(inventory[j] < inventory[j+1]){
                    int temp = inventory[j];
                    inventory[j] = inventory[j+1];
                    inventory[j+1] = temp;
                }
            }
        }
        return inventory;
    }
    
}