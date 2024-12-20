/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */

// TC-O(n)
// SC-O(n)
var countKDifference = function(nums, k) {
    let map=new Map();
    let count=0;

    for(let i=0;i<nums.length;i++){
        if(map.has(nums[i]-k)){
            count+=map.get(nums[i]-k);
        }
        if(map.has(nums[i]+k)){
            count+=map.get(nums[i]+k);
        }
        map.set(nums[i],(map.get(nums[i])||0)+1)
    }
    return count;
};