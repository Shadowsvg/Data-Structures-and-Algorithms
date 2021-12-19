/* Finding the element in array which is present more than n/2 times */

package Arrays;

public class MajorityElement {
    /* Boyer-Moore Majority Voting Algorithm */

    public static int majorityElement(int[] array){

        int index = 0;
        int count = 1;
        for(int i = 1; i < array.length; i++){
            if(array[i] == array[index]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                index = i;
                count = 1;
            }
        }
        int count1 = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == array[index]){
                count1++;
            }
        }
        if(count1 > array.length/2){
            return array[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,1,3,2,2,3,2,2};
        System.out.println(majorityElement(a));
    }
}
