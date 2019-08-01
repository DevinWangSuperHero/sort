package sort.practice.algorithm.practice;

import static sort.practice.algorithm.practice.util.Swap.swap;

public class SelectSort {

    private void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr,i,j);
                }
            }
        }
    }

}
