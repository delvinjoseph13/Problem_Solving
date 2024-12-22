/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map=new Map();
    let ansarray=[]
    for(let i=0;i<nums.length;i++){
        let a=nums[i];
        let b=target-a;

        if(map.has(b)==true){
            ansarray.push(map.get(b),i)
        }
      else{
         map.set(nums[i],i);
      }  
    }
    return ansarray;
    
};