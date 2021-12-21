package MathematicsAndNumberTheory;

public class GCD {

    /* GCD of any number is the greatest number which divides both of them
       gcd(a, 0) = a && gcd(0, b) = b
       gcd(a, b) = gcd(a-b, b)  if a > b
       more optimised
       gcd(a, b) = gcd(b, a%b)
     */

    public static void main(String[] args){

        int x = gcd(24, 72);
        System.out.println(x);
    }

    static int gcd(int a, int b){
        return (a % b == 0) ? b : gcd(b, a%b);
    }
}
