package Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {9, 7, 8, 15, 3, 2};

        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
