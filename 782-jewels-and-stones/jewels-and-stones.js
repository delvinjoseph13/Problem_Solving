/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let map=new Map();
    for(let i=0;i<stones.length;i++){
        if(map.has(stones[i])){
            map.set(stones[i],map.get(stones[i])+1)
        }else{
            map.set(stones[i],1)
        }
    }

    let count=0;
    for(let j=0;j<jewels.length;j++){
        if(map.has(jewels[j])){
            count+= map.get(jewels[j])
        }
    }
    return count;
};