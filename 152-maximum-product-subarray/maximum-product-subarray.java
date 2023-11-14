class Solution {
    public int maxProduct(int[] nums) {
        
       int n=nums.length;

       int prefix=1;//prefix means at the begining 
       int max1=Integer.MIN_VALUE;
       int suffix=1;//suffix means at the end
       int max2=Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
           if(prefix==0){
               prefix=nums[i];
           }
           else{
           prefix=prefix*nums[i];
           }
           max1=Math.max(max1,prefix);
    }

    for(int i=nums.length-1;i>=0;i--){
         if(suffix==0){
               suffix=nums[i];
           }
           else{
           suffix=suffix*nums[i];
           }
           max2=Math.max(max2,suffix);
    }
    return Math.max(max1,max2);
   
}
}