class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> valueToIndex=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int currentNum=nums[i];

            if(valueToIndex.containsKey(currentNum)){

                int lastIndex=valueToIndex.get(currentNum);

                if(i-lastIndex<=k){
                     return true;
                }
            }
            valueToIndex.put(currentNum,i);
        }
        return false;
        }
}