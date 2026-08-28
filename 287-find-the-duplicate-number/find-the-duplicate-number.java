class Solution {
    public int findDuplicate(int[] nums) {
        int[] newNums = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(newNums[nums[i]-1] == 0)
            newNums[nums[i]-1] = nums[i];
            else
            return nums[i];
        }
        return 0;

    }
}