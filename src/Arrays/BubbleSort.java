package Arrays;
/*
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
if they are in wrong order.
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] random = {5,3,4,2,6,9,8,7};
        int[] ans = bubbleSort(random);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

    static int[] bubbleSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j + 1] < arr[j]){
                    swapped = true;
                    swap(arr, j + 1, j);
                }
            }
            if(!swapped)
                break;
        }
        return arr;
    }

    static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
