class Solution {
    public int maxProfit(int[] prices) {
        int left=0,right=1;
        int max=0;

        while(right<prices.length){
            if(prices[right]<prices[left]){
                left=right;
                right++;
            }
            else{
                max=Math.max(max,prices[right]-prices[left]);
                right++;
            }
        }
        return max;
        
    }
}

//first in array we consider index 0 and 1 if the index 1 is less than 0 then we buy the stocks then we don't  want to buy the stocks after that we have to sell therefor the right pointer is incremented and calculate the maximum of the given max value and prices at right - left it will loop and right pointer is incretmented 


