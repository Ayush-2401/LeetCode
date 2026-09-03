class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != '(' && s.charAt(i) != ')'){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
                ans.append(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    continue;
                }
                stack.pop();
                ans.append(s.charAt(i));

            }
        }

        for(int i = ans.length()-1; i>=0; i--){
            if(!stack.isEmpty() && ans.charAt(i) == '('){
                ans.deleteCharAt(i);
                stack.pop();
            }
        }

        return ans.toString();
    }
}