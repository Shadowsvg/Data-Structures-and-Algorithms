package Arrays;
import java.util.Arrays;
//O(nlog(n)))

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {11, 30, 24, 7, 31, 16, 39, 41};
        MergeSort ms = new MergeSort();
        ms.printArray(array);
        ms.mergeSort(array, 0, array.length - 1);
        ms.printArray(array);
    }

    void mergeSort(int[] arr, int beg, int end){
        if(beg < end){
            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    void merge(int[] arr, int beg, int mid, int end){

        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++){
            left[i] = arr[beg + i];
        }
        for(int j = 0; j < n2; j++){
            right[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = beg;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }


    }

    void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
