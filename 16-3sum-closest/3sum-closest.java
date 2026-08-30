class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j<k){
                int temp = nums[i]+nums[j]+nums[k];

                if(temp == target){
                    return temp;
                }
                if(Math.abs(target - temp)<diff){
                    diff = Math.abs(target - temp);
                    sum = temp;
                }
                if(temp>target){
                    k--;
                }else{
                    j++;
                }

            }
        }
        return sum;
    }
}