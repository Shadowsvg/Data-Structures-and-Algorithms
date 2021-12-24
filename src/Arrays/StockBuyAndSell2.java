package Arrays;

public class StockBuyAndSell2 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 8, 7, 2, 5};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] arr){
        int profit = 0;
        for(int i=1; i<arr.length; i++){
            if (arr[i] > arr[i - 1]){
                profit = profit + (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }
}
