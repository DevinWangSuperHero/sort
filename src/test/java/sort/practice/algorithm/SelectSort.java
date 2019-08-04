package sort.practice.algorithm;

import org.junit.Test;

public class SelectSort {

    private void selectSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    Swap.swap(array,i,j);
                }
            }
        }
    }

    @Test
    public void test(){
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        selectSort(array);
        Print.printResult(array);

    }
}
