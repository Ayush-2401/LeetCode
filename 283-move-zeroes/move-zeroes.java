class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int rigth = 0;
        
        while(rigth<nums.length){
            if(nums[rigth] != 0){
                int temp = nums[left];
                nums[left] = nums[rigth];
                nums[rigth] = temp;
                left++;
            }
            
               rigth++;
        
        }
        
    }
}