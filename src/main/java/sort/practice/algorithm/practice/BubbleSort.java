package sort.practice.algorithm.practice;

import sort.practice.algorithm.practice.util.Print;

import static sort.practice.algorithm.practice.util.Swap.swap;

public class BubbleSort {
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i - 1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);;
        bubbleSort(array);
        Print.printResult(array);
    }
}
