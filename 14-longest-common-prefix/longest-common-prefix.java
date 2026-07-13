class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String px = "";
        int minLength = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i<strs.length; i++){
            if(strs[i].length()<minLength){
                minLength = strs[i].length();
                minIndex = i;
            }
        }

        for(int i = 0; i<minLength; i++){
            
            
            for(int j = 1; j<strs.length; j++){
                if(strs[j].charAt(i)!=strs[j-1].charAt(i)){
                    return px;
                }
                if(j==strs.length-1){
                    px += strs[j].charAt(i);
                }
            }
        }
        return strs[minIndex];
    }
}