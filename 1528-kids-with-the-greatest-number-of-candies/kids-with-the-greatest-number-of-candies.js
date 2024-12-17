/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
     let maxCandies=Math.max(...candies)
     let result=new Array(candies.length)
     for(let i=0;i<candies.length;i++){
        result[i]=candies[i]+extraCandies>=maxCandies
     }
     return result;
};