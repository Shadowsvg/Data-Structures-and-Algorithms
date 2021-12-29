package Hashing;

import java.util.HashSet;

public class CountDistinctElements {

    public static void main(String[] args) {
        int[] arr = {5, 10, 12, 10, 20, 35, 12, 20, 35, 99, 87, 100};
        CountDistinctElements cde = new CountDistinctElements();
        System.out.println(cde.countDistinctElements(arr));
    }

    int countDistinctElements(int[] arr){

        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            s.add(arr[i]);
        }
        return s.size();
    }
}
