package Test;

import java.util.ArrayList;
import java.util.List;

public class Coins {
    public static void main(String[] args) {
        double l = Math.log(1001)/Math.log(10);
        int n = (int)Math.log(10000)/(int)Math.log(10);
        System.out.println(l + ":" + n);
        System.out.println(Math.round(l));
    }

    public static boolean isPal(Integer n){
        Integer rem =0, rev=0, copy = n ;
        while(n != 0){  //13
            rem = n%10; //10
            n= n/10;    //3
            rev = (rev*10)+rem;
        }
        System.out.println(rem);
        return copy == rev;
    }

    public static void coins(){
        int[] arr = {1,3,6};
        int sum = 11;
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i>=0; i--) {
            while(sum >= arr[i]){
                sum -= arr[i];
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());
    }
}