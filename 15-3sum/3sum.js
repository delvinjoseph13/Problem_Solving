/**
 * @param {number[]} nums
 * @return {number[][]}
 */
//  TC-O(n^2)
//  SC-O(1)

var threeSum = function(nums) {
  const result=[];

    //selection sort

    // for(let i=0;i<nums.length;i++){
    //     let min_index=i;

    //     for(let j=i+1;j<nums.length;j++){
    //         if(nums[j]<nums[min_index]){
    //             min_index=j;
    //         }
    //     }
    //         let temp=nums[min_index];
    //         nums[min_index]=nums[i];
    //         nums[i]=temp;
        
    // }
    nums.sort((a,b)=>a-b);

    for(let i=0;i<nums.length-2;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        let left=i+1;
        let right= nums.length-1;

        while(left<right){
            const sum=nums[i]+nums[left]+nums[right];

            if(sum==0){
                result.push([nums[i],nums[left],nums[right]]);

                while(left<right && nums[left]==nums[left+1]) left++;
                while(left<right && nums[right]==nums[right-1]) right--;
                left++;
                right++;
            }
            else if(sum<0){
                left++;
            }else{
                right--;
            }
        }
    }
    return result;
};