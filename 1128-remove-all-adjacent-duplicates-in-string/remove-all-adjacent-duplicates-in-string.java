class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = s.length()-1; i>=0; i--){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            } 
            if(stack.peek()!=s.charAt(i)){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }  
        String ans = "";
        while(!stack.isEmpty()){
            ans += (stack.peek()).toString();
            stack.pop();
        } 
        return ans;
    }
}