class Solution {
    public String reverseWords(String s) {
        String words[] = s.trim().split("\\s+");
        String ans = "";
        int left = 0;
        int right = words.length-1;
        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i<words.length; i++){
            if(i == 0){
                ans = words[i];
            }else{
                ans = ans +" "+words[i];
            }
            
        }
        return ans;

    }
}