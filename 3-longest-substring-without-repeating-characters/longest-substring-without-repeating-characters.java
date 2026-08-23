class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        HashMap<Character, Integer> map  = new HashMap<>();
        int left = 0;
        int right = 0;
        while(right<s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);

            while(map.get(s.charAt(right))>1){
                map.replace(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            longest = Math.max(longest, right - left + 1);
            right++;
        }
        return longest;
    }
}