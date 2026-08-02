class Solution {
    public int balancedString(String s) {

        int n = s.length()/4;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(char c : new char[]{'Q','W','E','R'}){
            map.putIfAbsent(c, 0);
        }
        if(map.get('Q') == n && map.get('E') == n && map.get('W') == n && map.get('R') == n){
            return 0;
        }

        int left = 0;
        int minLen = s.length();
        for(int right = 0; right<s.length(); right++){
            char rigthChar = s.charAt(right);
            map.put(rigthChar, map.get(rigthChar)-1);
            while(left<= right && map.get('Q') <= n && map.get('E') <= n && map.get('W') <= n && map.get('R') <= n){
                minLen = Math.min(minLen, right - left + 1);
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)+1);
                left++;
            }
            
        }
        return minLen;
    }
}