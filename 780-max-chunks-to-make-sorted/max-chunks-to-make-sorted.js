/**
 * @param {number[]} arr
 * @return {number}
 */
//  TC-O(n);
//  SC-O(1);
var maxChunksToSorted = function(arr) {
    let maxSoFar=0;
    let chunks=0;

    for(let i=0;i<arr.length;i++){
        maxSoFar=Math.max(arr[i],maxSoFar);
        if(maxSoFar==i){
            chunks++;
        }
    }
    return chunks
};