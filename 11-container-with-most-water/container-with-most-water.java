class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxWater=0;

        while(left<right){
          int  width=right-left;

           int min_height=Math.min(height[left],height[right]);
            
          int water=width*min_height;

          maxWater=Math.max(maxWater,water);

          if(height[left]<height[right]){
              left++;
          }else right--;
            
        }
        return maxWater;
    }
}

































// class Solution {
//     public int maxArea(int[] height) {
//         int left = 0;                   // Left pointer starting from the leftmost edge
//         int right = height.length - 1;  // Right pointer starting from the rightmost edge
//         int maxWater = 0;               // Initialize the maximum water capacity
        
//         while (left < right) {
//             // Calculate the width of the container
//             int width = right - left;
            
//             // Calculate the height of the container (the minimum height between the two lines)
//             int h = Math.min(height[left], height[right]);
            
//             // Calculate the water capacity of the current container
//             int water = width * h;
            
//             // Update the maximum water capacity if the current container holds more water
//             maxWater = Math.max(maxWater, water);
            
//             // Move the pointers towards each other
//             if (height[left] < height[right]) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
        
//         return maxWater;
//     }
// }