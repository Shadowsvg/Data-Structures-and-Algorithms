package Arrays;
import java.util.Arrays;
/*
QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array
around the picked pivot. The key process in quickSort is partition(). Target of partitions is, given an
array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller
elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should
be done in linear time.
 */

public class QuickSort{
    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

    static int partition(int[] arr, int l, int h){

        int pivot = arr[l];
        int i = l;
        int j = h;
        while(i < j){
            while(arr[i] <= pivot && i <= h - 1)
                i++;
            while(arr[j] > pivot && j >= l)
                j--;
            if(i < j)
                swap(arr, i, j);
        }
        swap(arr, l, j);
        return j;
    }

    static void quickSort(int[] arr, int l, int h){
        if(l < h){
            int pivot = partition(arr, l, h);
            quickSort(arr,l, pivot - 1);
            quickSort(arr, pivot + 1, h);
        }
    }

    static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
