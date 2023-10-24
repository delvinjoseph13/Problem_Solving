class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];

       
        // int candidate = nums[0];
        // int count = 1;

        // for (int i = 1; i < nums.length; i++) {
        //     if (count == 0) {
        //         candidate = nums[i];
        //         count = 1;
        //     } else if (candidate == nums[i]) {
        //         count++;
        //     } else {
        //         count--;
        //     }
        // }

        // return candidate;
    }

}