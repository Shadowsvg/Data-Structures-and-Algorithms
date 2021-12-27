package Arrays;

import java.net.SocketException;

public class SortedAndRotatedArray {
    public static void main(String[] args) {
        int[] arr = {20, 25, 27, 30, 35, 36, 2, 4, 11, 15};
        SortedAndRotatedArray sra = new SortedAndRotatedArray();
        System.out.println(sra.rotated(arr, 11));
    }

    int rotated(int[] arr, int key){

        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int mid = (low + high)/ 2;
            if(key == arr[mid])
                return mid;
            if(arr[low] < arr[mid]){
                if(key >= arr[low] && key < arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(key > arr[mid] && key <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;

                }
            }
        }
        return -1;
    }
}
