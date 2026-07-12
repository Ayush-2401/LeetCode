class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int length = 0;
        
        for(int i = 0; i<words.length; i++){
            
            if(words[i].length()>length){
                length = words[i].length();
                
            }
        }
        List<String> finAns = new ArrayList<>();
        for(int i = 0; i<length; i++){
            String ans = "";
            for(int j = 0;j<words.length; j++){
                if(i>words[j].length()-1){
                    ans += " ";
                }else
                ans += words[j].charAt(i);
            }
            
            while (ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ') {
                ans = ans.substring(0, ans.length() - 1);
            }
            finAns.add(ans);
        }



        return finAns;
    }
}