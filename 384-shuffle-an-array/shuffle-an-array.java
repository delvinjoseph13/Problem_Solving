class Solution {
    
    int[] A;
    public Solution(int[] nums) {
       A=nums;
    }
    
    public int[] reset() {
       return A;
    }
    
    public int[] shuffle() {
        int[] shuffle=A.clone();
        for(int i=shuffle.length-1;i>=0;i--){
            int j=new Random().nextInt(i+1);
            int temp=shuffle[i];
            shuffle[i]=shuffle[j];
            shuffle[j]=temp;
        }
        return shuffle;
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */