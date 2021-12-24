package Arrays;

public class StockBuyAndSell1 {

    public static void main(String[] args) {
        int[] a = {3, 2, 4, 8, 7, 2, 5};
        System.out.println(maxProfit(a));

    }

    static int maxProfit(int[] arr){
        int maxProfit = 0;
        int minSoFar = arr[0];

        for(int i = 0; i < arr.length; i++){
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
