package Hashing;

import java.util.HashSet;

public class UnionOfArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 9};
        UnionOfArrays ua = new UnionOfArrays();
        System.out.println(ua.union(arr1, arr2));
    }

    int union(int[] arr1, int[] arr2){
        HashSet<Integer> s = new HashSet<>();
        for(int i: arr1){
            s.add(i);
        }
        for(int i: arr2){
            s.add(i);
        }
        return s.size();

    }
}
