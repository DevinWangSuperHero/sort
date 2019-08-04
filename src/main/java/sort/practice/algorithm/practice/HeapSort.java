package sort.practice.algorithm.practice;

import sort.practice.algorithm.practice.util.Print;

import static sort.practice.algorithm.practice.util.Swap.swap;

public class HeapSort {
 private static void buildHeap(int[] arr, int i){
     for(int j = (i - 1)/ 2; j >= 0; j--) {
         if ((i == j*2 + 1) && (i%2 == 1)){
           if (arr[j] > arr[2*j+1]) {
               swap(arr,j,2*j + 1);
           }
         } else {
             if (arr[j] < arr[2*j + 1]) {
                 swap(arr,j,2*j + 1);
             }
             if (arr[j] < arr[2*j+2]) {
                 swap(arr,j,2*j+2);
             }
         }
     }
//     swap(arr,i,0);
 }

public static void main(String[] args) {
    int[] array=new int[]{3,2,1,4,5};
    Print.printResult(array);
    for (int i = array.length - 1; i >= 0; i--) {
        buildHeap(array,i);
    }
    Print.printResult(array);
}

}
