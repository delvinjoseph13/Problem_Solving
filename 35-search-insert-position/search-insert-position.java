class Solution {
    public int searchInsert(int[] nums, int target) {
       ArrayList<Integer> array=new ArrayList<>();
       for(int i:nums){
           array.add(i);
       }//1,3,5,6
       array.add(target);
       Collections.sort(array);//1,3,5,5,6
       return array.indexOf(target);

    }
}