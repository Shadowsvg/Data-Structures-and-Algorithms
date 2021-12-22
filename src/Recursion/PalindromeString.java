package Recursion;
//  O(n)

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("raceca", 0, 5));
    }

    static boolean isPalindrome(String s, int l, int r){
        if(l > r){
            return true;
        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalindrome(s, l + 1, r - 1);
    }
}
