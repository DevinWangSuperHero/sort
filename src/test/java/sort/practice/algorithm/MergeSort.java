package sort.practice.algorithm;

import org.junit.Test;

public class MergeSort {
    public void merge(int[] array, int i, int middle, int j){
        int m = i;
        int n = middle + 1;
        int k = n;
        int[] tmp = new int[array.length];
        while ((m <= middle && n <= j)) {
            if (array[m] < array[j]) {
                tmp[k++] = array[m++];
            } else {
                tmp[k++] = array[n++];
            }
        }
        while (m <= middle) {
            tmp[k++] = array[m++];
        }
        while (n <= j) {
            tmp[k++] = array[n++];
        }
        while (i<=j) {
            array[i] = tmp[i++];
        }
    }

    public void sort(int[] array, int i, int j) {
        if (i<j){
            int middle = (i+j)/2;
            sort(array,i,middle);
            sort(array,middle+1,j);
            merge(array,i,middle,j);
        }
    }

    @Test
    public void test() {
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        sort(array,0,array.length-1);
        Print.printResult(array);
    }
}
