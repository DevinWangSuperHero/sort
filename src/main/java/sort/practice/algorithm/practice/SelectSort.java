package sort.practice.algorithm.practice;

import sort.practice.algorithm.practice.util.Print;

import static sort.practice.algorithm.practice.util.Swap.swap;

public class SelectSort {

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        sort(array);
        Print.printResult(array);
    }

}
