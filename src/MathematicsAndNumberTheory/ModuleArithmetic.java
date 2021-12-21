package MathematicsAndNumberTheory;

public class ModuleArithmetic {

    public static void main(String[] args) {
        long d = fastPower(2, 5);
        System.out.println(d);
        System.out.println(optimisedFastPower(3978432, 5, 1000000007));
    }

    static int fastPower(int a, int b){

        int res = 1;
        while(b > 0) {
            if ((b & 1) != 0) {                // b&1 = b%2
                res = res * a;
            }
            a = a * a;
            b = b >> 1;                        // b >> 1 = b / 2  &&  b << 1 = b * 2
        }
        return res;
    }

    static long optimisedFastPower(long a, long b, int n){
        /*
        (a + b) % n = (a % n + b % n) % n;
        (a * b) % n = (a % n * b % n) % n;
         */
        long res = 1;
        while(b > 0){
            if((b & 1) != 0){
                res = (res * a % n) % n;     // here res % n is always be res as res is smaller than n;
            }
            a = (a % n * a % n) % n;
            b = b >> 1;
        }
        return res;
    }
}
