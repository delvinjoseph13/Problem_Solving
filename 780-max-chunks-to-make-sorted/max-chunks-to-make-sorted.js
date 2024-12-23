/**
 * @param {number[]} arr
 * @return {number}
 */
//  TC-O(n);
//  SC-O(1);
var maxChunksToSorted = function(arr) {
    let maxElement=0;
    let chunks=0;

    for(let i=0;i<arr.length;i++){
        maxElement=Math.max(arr[i],maxElement);
        if(maxElement==i){
            chunks++;
        }
    }
    return chunks
};