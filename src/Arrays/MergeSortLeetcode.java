package Arrays;
import java.util.Arrays;

class MergeSortLeetcode {

    public static void main(String[] args) {
        int[]  nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        MergeSortLeetcode msl = new MergeSortLeetcode();
        msl.merge(nums1, m, nums2, n);

    }
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[m + n];

        while((i < m) && (j < n)){

            if(nums1[i] <= nums2[j]){

                ans[k] = nums1[i];
                // k++;
                i++;
            }
            else{
                ans[k] = nums2[j];
                // k++;
                j++;
            }
            k++;

        }

        while(i < m){
            ans[k] = nums2[j];
            k++;
            i++;
        }
        while(j < n){
            ans[k] = nums1[i];
            k++;
            j++;
        }
        for(int a = 0; a < ans.length; a++){
            System.out.print(ans[a] + " ");
        }
        return ans;


    }
}