class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> mapC = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
           mapC.put(s.charAt(i), mapC.getOrDefault(s.charAt(i),0)+1);
           mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0)+1);
        }
        return mapC.equals(mapT);
    }
}