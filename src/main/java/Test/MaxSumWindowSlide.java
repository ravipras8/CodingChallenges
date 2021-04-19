package Test;

public class MaxSumWindowSlide {
    public static void main(String[] args) {
        // {1, 4, 2, 10, 23, 3, 1, 0, 20}
        // k=4
        // output 39
        // {100, 200, 300, 400}
        // k=2
        // output 700
        int arr[] = {100, 200, 300, 400};
        int k =4;
        System.out.println(maxSumInSubset(arr, k));
    }

    public static int maxSumInSubset(int[]arr, int k){
        int maxSum = 0;
        for (int i = 0; i < arr.length - k + 1; i++) {
            int currentSum =0;
            for (int j = 0; j < k; j++) {
                currentSum += arr[i+j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}