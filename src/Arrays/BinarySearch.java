package Arrays;
/*
O(log(n));
 */

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearchIteration(arr, 4));
        System.out.println(bs.binarySearchRecursion(arr, 2,0,7));
    }

    int binarySearchIteration(int[] arr, int key){

        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(key == arr[mid]){
                return mid;
            }
            if (key < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }
        return -1;
    }

    int binarySearchRecursion(int[] arr, int key, int low, int high){
        if(low > high)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(key < arr[mid]){
            return binarySearchRecursion(arr, key, low, mid - 1);
        }
        return binarySearchRecursion(arr, key, mid + 1, high);
    }
}
