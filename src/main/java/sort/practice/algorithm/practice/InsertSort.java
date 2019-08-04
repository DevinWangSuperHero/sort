package sort.practice.algorithm.practice;

import sort.practice.algorithm.practice.util.Print;

public class InsertSort {
    private static void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    System.arraycopy(array,j,array,j+1,i-j);
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        insertSort(array);
        Print.printResult(array);
    }
}
