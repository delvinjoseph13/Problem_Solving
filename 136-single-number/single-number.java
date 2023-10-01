class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
        
    }
}

//example 2 will be like first ans=000 in binary format,after i=4,ans=100^000=100 after i=1 ans=100^001=101 finally 110^010=100=4 same number gives 0 and any number xor with 0 gives the same number