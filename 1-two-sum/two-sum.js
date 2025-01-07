/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
let map=new Map();
let ans=[];
for(let i=0;i<nums.length;i++){
    let a=nums[i];
    let b=target-a;
    if(map.has(b)){
        ans.push(map.get(b),i)
    }
    map.set(nums[i],i)
}
   return ans; 
};