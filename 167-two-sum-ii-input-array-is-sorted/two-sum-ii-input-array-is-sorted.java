class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // num=numbers.length()-1;
       for(int i=0;i<numbers.length;i++){
           for(int j=i+1;j<numbers.length;j++){
               if(numbers[i]+numbers[j]==target){
                   return new int[] {i+1,j+1};
               }
           }
       } 
       return new int[] {};
    }
}



    