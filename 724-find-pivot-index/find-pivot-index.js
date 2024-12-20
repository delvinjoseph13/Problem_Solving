/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let preffixsum=0;
    let preffixarray=[];

    for(let i=0;i<nums.length;i++){
        preffixsum+=nums[i];
        preffixarray.push(preffixsum)
    }
    console.log(preffixarray)

    let suffixsum=0;
    let suffixarray=[];
    for(let i=nums.length-1;i>=0;i--){
        suffixsum+=nums[i];
        suffixarray.push(suffixsum)
    }
     suffixarray.reverse();
     console.log(suffixarray)

     for(let i=0;i<nums.length;i++){
        let leftsum=0;
        let rightsum=0;

        if(i>=1){
            leftsum=preffixarray[i-1]
        }
        if(i<nums.length-1){
            rightsum=suffixarray[i+1]
        }

        if(leftsum==rightsum){
            return i;
        }

     }
     return -1;
};