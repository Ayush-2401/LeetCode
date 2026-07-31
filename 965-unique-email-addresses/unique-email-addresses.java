class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniEmails = new HashSet<>();
        
        for(int i = 0; i<emails.length; i++){
            boolean local = true;
            String email = "";
            for(int j = 0; j<emails[i].length(); j++){
                if(emails[i].charAt(j) == '.' && local){
                    continue;
                }
                else if(emails[i].charAt(j) == '+'){
                    for(int k = j; k<emails[i].length(); k++){
                        if(emails[i].charAt(k) == '@'){
                            j = k;
                            local = false;
                        }
                    }
                }
                else if(emails[i].charAt(j) == '@')
                local = false;
                email += emails[i].charAt(j);
            }
            
            uniEmails.add(email);
          
        }
        
        return uniEmails.size();
    }
}