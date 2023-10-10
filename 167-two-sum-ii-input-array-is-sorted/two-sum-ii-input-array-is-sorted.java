class Solution {
    public int[] twoSum(int[] numbers, int target) {
    // this is one approach but time complecity is higth
    //    for(int i=0;i<numbers.length;i++){
    //        for(int j=i+1;j<numbers.length;j++){
    //            if(numbers[i]+numbers[j]==target){
    //                return new int[] {i+1,j+1};
    //            }
    //        }
    //    } 
    //    return new int[] {};

    //other method
    int left=0,right=numbers.length-1;

    while(numbers[left]+numbers[right]!=target){
        if(numbers[left]+numbers[right]<target){
            left++;
        }else right--;

    }
    return new int[] {left+1,right+1};


    }
}



    