package sort.practice.algorithm.practice;

import sort.practice.algorithm.practice.util.Print;

public class MergeSort {
    private static void merge(int[] array, int i,int middle,  int j) {
        int[] temp = new int[array.length];
        int m = i;
        int n = middle + 1;
        int k = i;
        while (m <= middle && n <= j) {
            if (array[m] < array[n]){
                temp[k++] = array[m++];
            } else {
                temp[k++] = array[n++];
            }
        }
        while (m <= middle) {
            temp[k++] = array[m++];
        }
        while (n <= j) {
            temp[k++] = array[n++];
        }

        while (i<=j){
            array[i] = temp[i++];
        }
    }

    private static void sort(int[] array, int i, int j) {
        if (i<j){
            int middle = (i+j)/2;
            sort(array,i,middle);
            sort(array,middle+1,j);
            merge(array,i,middle,j);
        }
    }

    public static void main(String[] args) {
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        sort(array,0,array.length-1);
        Print.printResult(array);
    }
}
