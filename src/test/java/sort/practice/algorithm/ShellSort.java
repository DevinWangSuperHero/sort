package sort.practice.algorithm;

import org.junit.Test;

public class ShellSort {

    public void shellSort(int[] array) {
        int h = 1;
        while (h < array.length/3){
            h = h *3 + 1 ;
        }
        while (h > 0) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j < array.length; j+=h) {
                    if (array[j] < array[j-h]) {
                        int temp = array[j];
                        int k = j;
                        for (;k >= i && temp < array[k-h];k-=h) {
                            array[k] = array[k - h];
                        }
                        array[k] = temp;
                    }
                }
            }
            h = (h-1)/3;
        }
    }

    @Test
    public void test(){
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        shellSort(array);
        Print.printResult(array);
    }
}
