package Hashing;

import java.util.HashSet;

public class HashSetPractise {

    public static void main(String[] args) {

        HashSet<Integer> s = new HashSet<Integer>();  // You can mention size of hashset in constructor
        s.add(5);
        s.add(10);
        s.add(5); // will override the initial value
        System.out.println(s);
        if(s.contains(15)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
        s.remove(10);
        System.out.println(s);
        System.out.println(s.isEmpty());
        s.add(100);
        System.out.println(s.size());
        s.clear();
        System.out.println(s.size());

    }

}
