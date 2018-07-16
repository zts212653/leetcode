// easy array 122 O(n) runtime
class BestTimetoBuyandSellStock2 {
    public int maxProfit(int[] prices) {
        // Buy的问题其实是在在peak 和 valley 如果可以多次购买和卖出。 在局部的peak卖出在局部的valley 买入。
        // 所以其实可以直接计算增长
        int max = 0;
        for (int i = 1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max+=prices[i]-prices[i-1];
            }

        }
        return max;

    }
}