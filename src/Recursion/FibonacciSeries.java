package Recursion;

public class FibonacciSeries {

    public static void main(String[] args) {
        FibonacciSeries fb = new FibonacciSeries();
        for(int i = 0; i < 10; i++){
            fb.fib(i);
        }
    }

    public void fib(int n) {
        // if(n == 0){
        //     return 0;
        // }
        // if(n == 1){
        //     return 1;
        // }
        // return (fib(n - 1) + fib(n - 2));
        if(n == 0){
            System.out.println(0);
            return;
        }
        if(n == 1){
            System.out.println(1);
            return;
        }

        int[] arr = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(arr[n]);
//        return;
    }
}
