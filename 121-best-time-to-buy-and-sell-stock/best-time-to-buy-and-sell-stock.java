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




// class Solution {
//     public int maxProfit(int[] prices) {
//         int i=0,j=1;
//         int max=0;
//         while(j<prices.length){
//             if(prices[j]<prices[i]){
//                 i=j;
//                 j++;
//             }
//             else{
//             max=Math.max(max,prices[j]-prices[i]);
//             j++;
//             }
//         }
//         return max;
//     }
// }