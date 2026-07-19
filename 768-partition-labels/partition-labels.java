class Solution {
    public List<Integer> partitionLabels(String s) {
        int left = 0;
        int right = s.length()-1;
       
        HashMap<Character, Integer> endMap = new HashMap<>();

        while(left<s.length()){
           
            
            endMap.putIfAbsent(s.charAt(right), right);
            left++;
            right--;
        }

        ArrayList<Integer> ans = new ArrayList<>();
       
        int start = 0;
        int last = 0;
        
        for(int i =0; i<s.length(); i++){
            last = Math.max(last, endMap.get(s.charAt(i)));

            if(i == last){
                ans.add(last - start +1);
                start = i+1;
            }
        }
        
        
        return ans;

    }
}