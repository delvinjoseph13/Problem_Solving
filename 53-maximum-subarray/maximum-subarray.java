class Solution {
    public int maxSubArray(int[] nums) {
        int cmax=0;
        int omax=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
             if(cmax<0){
                 cmax=nums[i];
             }else{
                 cmax=cmax+nums[i];
             }
             omax=Math.max(omax,cmax);
        }
        return omax;
    }
}