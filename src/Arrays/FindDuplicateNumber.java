package Arrays;
import java.util.*;


public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums){
// Brute Force method
//        for(int i=0; i<nums.length -1 ; i++){
//            for(int j=i + 1; j< nums.length; j++){
//                if(nums[i] == nums[j]){
//                    return nums[i];
//                }
//            }
//        }
//        return -1;

// More optimised method
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length-1){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
            i += 1;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,4};
        int b = findDuplicate(a);
        System.out.println(b);
    }
}
