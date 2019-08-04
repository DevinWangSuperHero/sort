package sort.practice.algorithm;

import org.junit.Test;

public class HeapSort {
    public void buildHeap(int[] array, int h){
        for (int i = (h - 1)/2; i >=0 ; i--) {
            if (h == i*2+1 && i%2 == 1){
                if (array[i]  < array[2*i+1]){
                    Swap.swap(array,i,i*2+1);
                }
            } else {
                if (array[i]  < array[2*i+1]){
                    Swap.swap(array,i,2*i+1);
                }
                if (array[i] < array[2*i+2]){
                    Swap.swap(array,i,2*i+2);
                }
            }
        }
    }

    @Test
    public void test() {
        int[] array=new int[]{3,2,1,4,6,5};
        Print.printResult(array);
        for (int i = array.length-1; i >= 0; i--) {
            buildHeap(array,i);
        }
        Print.printResult(array);
    }
}
