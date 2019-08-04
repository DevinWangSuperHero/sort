package sort.practice.algorithm.practice;

import sort.practice.algorithm.practice.util.Print;

public class ShellSort {
    private static void shellSort(int[] array) {
        int h = 1;
        while(h < array.length/3) {
            h = h*3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < array.length; i++) {
                for (int k = i; k < array.length; k+=h){
                    if (array[k] < array[k-h]) {
                        int tmp = array[k];
                        int j = k;
                        for (;j>=i&&tmp < array[j-h]; j-=h) {
                            array[j] = array[j-h];
                        }
                        array[j] = tmp;
                    }
                }
            }
            h = (h-1)/3;
        }
    }

    public static void main(String[] args) {
        int[] array=new int[]{8,3,2,1,7,4,6,5};
        Print.printResult(array);
        shellSort(array);
        Print.printResult(array);
    }
}
