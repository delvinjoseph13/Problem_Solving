/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function(x, n) {
  function power(x,n){
    if(n===0){
        return 1;
    }
    if(n===1){
        return x;
    }
    let res=power(x,Math.floor(Math.abs(n)/2));
    let ans=res * res;

    if(n%2!==0){
        return x*ans;
    }else{
        return ans;
    }
  }
   // Handle negative powers
  if (n < 0) {
    return 1 / power(x, n); // For negative powers, return reciprocal
  }
  return power(x, n);
};