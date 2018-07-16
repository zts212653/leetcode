// easy array 121 O(n) runtime 其实这个和max sub string 是一个道理的
class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        // O(n)
        int buy = 0;
        int lastMax = 0;
        int state = 0;
        int max = 0;
        for(int i = 0;i<prices.length;i++){
            if(i==0){
                buy = prices[0];
            }else{
                if(buy>prices[i]){//保留下前一个buy的最大pro 把新的buy变成p i 用lastMax 存上一个buy的最大值
                    lastMax = max;
                    buy = prices[i];
                }else{
                    state = Math.max(state,prices[i]-buy);
                    max = Math.max(lastMax,state);
                }

            }

        }
        return max;

    }
}