import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
       //one method using o(n2) time

        // int n=nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //another method using hash method

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
        
    }
}
        