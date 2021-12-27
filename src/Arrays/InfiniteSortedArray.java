package Arrays;

public class InfiniteSortedArray {

    public static void main(String[] args) {

        int[] arr = {2, 4, 7, 9, 11, 15, 20, 34, 56, 48};
        InfiniteSortedArray is = new InfiniteSortedArray();
        System.out.println(is.infinite(arr, 9));

    }

    int infinite(int[] arr, int key){
        BinarySearch bs = new BinarySearch();
        int low = 0;
        int high = 1;
        while(arr[high] <= key){
            low = high;
            high = high * 2;
        }

        return bs.binarySearchRecursion(arr, key, low, high);
    }
}
