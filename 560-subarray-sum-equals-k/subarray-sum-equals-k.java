class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count = 0;
        // for(int i = 0; i<nums.length; i++){
        //     int j = i;
        //     int sum = k;
        //     while(j<nums.length){
                
        //         sum = sum - nums[j]; 
               
        //         if(sum == 0){
        //             count++;
                    
        //         }
        //         j++;
        //     }
        // }
        // return count;


        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> preffixfrequency = new HashMap<>();

        preffixfrequency.put(0,1);
        for(int i : nums){
            prefixSum += i;
            if(preffixfrequency.containsKey(prefixSum - k)){
                count += preffixfrequency.get(prefixSum - k);
            }
            preffixfrequency.put(prefixSum, preffixfrequency.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}