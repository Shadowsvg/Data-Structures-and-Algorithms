package Recursion;

public class PowersetOfString {

    public static void main(String[] args) {
        powerSet("abc", 0, "");
    }

    static void powerSet(String str, int i, String cur){
        if(i == str.length()){
            System.out.println(cur);
            return;
        }

        powerSet(str, i + 1, cur + str.charAt(i));
        powerSet(str, i + 1, cur);


    }
}
