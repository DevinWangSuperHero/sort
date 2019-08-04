package sort.practice.algorithm;

import org.junit.Test;

public class QuickSort {

    public void quickSort(int[] array, int start, int end) {
        if (start == end) return;
        int key = array[start];
        int i = start + 1;
        int j = end;
        while (i < j) {
            for (;key > array[i] && i < j; i++);
            for (;key < array[j] && i < j; j--);
            Swap.swap(array,i,j);
        }
        if (key > array[i]) {
            Swap.swap(array, start, i);
        }
        quickSort(array, start, i -  1);
        quickSort(array, i , end);
    }

    @Test
    public void test(){
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        quickSort(array,0,array.length-1);
        Print.printResult(array);
    }
}
