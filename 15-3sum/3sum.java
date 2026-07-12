class Solution {
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
        return merge(left, right);
    }
    private static int[] merge(int[] f, int[] s){
        int[] mix = new int[f.length+s.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<f.length && j<s.length){
            if(f[i]<s[j]){
                mix[k] = f[i];
                i++;
            }else{
                mix[k] = s[j];
                j++;
            }
            k++;
        }
        while(i<f.length){
            mix[k]=f[i];
            i++;
            k++;
        }
        while(j<s.length){
            mix[k]=s[j];
            j++;
            k++;
        }
        return mix;
    }

    public List<List<Integer>> threeSum(int[] nums) {
       
        nums = mergeSort(nums);
        List<List<Integer>> ans = new ArrayList<>(); 
        for(int i = 0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);

                    left++;
                    right--;

                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                    
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}