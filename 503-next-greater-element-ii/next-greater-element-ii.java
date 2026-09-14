class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = i;
        while(i<ans.length){
            if(nums[i]<nums[(j+1)%nums.length]){
                ans[i] = nums[(j+1)%nums.length];
                i++;
                j = i;
            }else{
                j = (j+1)%nums.length;
                if(i == j){
                    ans[i] = -1;
                    i++;
                    j = i;
                }
            }
        }
        return ans;
    }
}