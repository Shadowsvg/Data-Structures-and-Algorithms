package Arrays;
import java.util.Arrays;
/*
O(n^2)
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {2, 4 ,6, 8, 3, 5, 1, 10, 15, 14};
        int[] ans = selectionSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] selectionSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                swap(arr, min, i);
            }
        }
        return arr;
    }

    static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
