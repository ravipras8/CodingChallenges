package Test;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 ,3};

        sort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i+",");
        }
    }

    public static void sort(int arr[], int l, int h) {
        int mid = (l + h) / 2;
        if (l < h) {
            sort(arr, l, mid);
            sort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }

    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }
            k++;
        }
        while(i<n1){
            arr[k++] = L[i++];
        }
        while(j<n2){
            arr[k++] = R[j++];
        }
    }

}