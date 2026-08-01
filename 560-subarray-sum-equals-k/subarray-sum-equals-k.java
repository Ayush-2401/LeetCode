class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int j = i;
            int sum = k;
            while(j<nums.length){
                
                sum = sum - nums[j]; 
               
                if(sum == 0){
                    count++;
                    
                }
                j++;
            }
        }
        return count;
    }
}