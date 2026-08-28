class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        
        int length = Integer.MAX_VALUE;
        while(right<nums.length){
            if(sum<target){
                
                sum += nums[right];
                right++;
            }
            while(sum>=target){
                length = Math.min(length, right - left);
                sum -= nums[left];
                left++;
            }
        }
        if(length == Integer.MAX_VALUE)
        return 0;
        return length;
    }
}