package Hashing;

import java.util.HashSet;

public class IntersectionOfArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {4, 5, 6, 7, 8, 9};
        IntersectionOfArrays ia = new IntersectionOfArrays();
        System.out.println(ia.intersection(arr1, arr2));
    }

    int intersection(int[] arr1, int[] arr2){

        HashSet<Integer> s = new HashSet<>();
        for(int a : arr1){
            s.add(a);
        }

        int count = 0;
        for(int b : arr2){
            if(s.contains(b)){
                count++;
                s.remove(b);
            }
        }
        return count;
    }
}
