//121
public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        
    }

    
    // O(n)
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

    // bruteforce approach
    public static  int maxProfit2(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int profit = 0;

        for(int i = 0 ; i < prices.length-1 ; i++){
            for(int j = i+1 ; j < prices.length ; j++){
                profit = prices[j] - prices[i];

                if(profit > maxProfit)
                    maxProfit = profit;

            }
        }

        return maxProfit > 0 ? maxProfit : 0;
    }
}
