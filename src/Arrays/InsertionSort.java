package Arrays;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 5, 9, 2};
        int[] ans = insertionSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] insertionSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
