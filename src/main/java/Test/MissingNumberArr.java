package Test;

import java.util.Arrays;

public class MissingNumberArr{
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,10};
        int arr[] = {2,4,6,10};
        
        System.out.println(findMissing(arr));
        // findMissingWithFormula(arr);
    }

    public static int findMissing(int arr[]){
        int missing = -1, diff =findTheDiff(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i] != diff){
                missing = arr[i]+ diff;
                break;
            }
        }
        return missing;
    }

    public static int findTheDiff(int[] arr){
        return (arr[arr.length-1] - arr[0])/arr.length;
    }
}