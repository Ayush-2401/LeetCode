class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while(left<right){
            int w = Math.min(height[left], height[right]);
            area = Math.max((right - left)*w, area);
            if(height[left] <  height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        return area;
    }
}