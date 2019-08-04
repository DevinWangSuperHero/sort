package sort.practice.algorithm;

import org.junit.Test;

public class InsertSort {
    public void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]){
                    int temp = array[j];
                    System.arraycopy(array,i,array,i+1,j-i);
                    array[i] = temp;
                }
            }
        }
    }

    @Test
    public void test(){
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        insertSort(array);
        Print.printResult(array);
    }
}
