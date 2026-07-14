class Solution {
    public int singleNumber(int[] nums) {
        int uni = 0;
        for(int i = 0; i<nums.length; i++){
            uni = uni ^ nums[i];
            if(i == nums.length-1){
                return uni;
            }
        }
        return 0;
    }
}