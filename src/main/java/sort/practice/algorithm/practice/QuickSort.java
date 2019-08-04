package sort.practice.algorithm.practice;

import sort.practice.algorithm.practice.util.Print;

import static sort.practice.algorithm.practice.util.Swap.swap;

public class QuickSort {

    private static void quickSort(int[] array,int start, int end) {
        if (start == end) {
            return;
        }
        int key = array[start];
        int i = start + 1;
        int j = end;
        while (i < j) {
            for (;array[i]<key && i<j; i++);
            for (;array[j]>key && i<j; j--);
            swap(array,i,j);
        }
        if (key > array[i]) {
            swap(array,start,i);
        }
        quickSort(array,start,i-1);
        quickSort(array,i,end);
    }

    public static void main(String[] args) {
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        quickSort(array,0,array.length - 1);
        Print.printResult(array);
    }
}
