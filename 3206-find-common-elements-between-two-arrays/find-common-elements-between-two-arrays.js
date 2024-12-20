/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var findIntersectionValues = function(nums1, nums2) {
    let set1=new Set(nums1);
    let set2=new Set(nums2);
    let answer1=0;
    let answer2=0;

    for(let i=0;i<nums1.length;i++){
        if(set2.has(nums1[i])){
            answer1++;
        }
    }
    for(let j=0;j<nums2.length;j++){
        if(set1.has(nums2[j])){
            answer2++;
        }
    }
    return [answer1,answer2]
};