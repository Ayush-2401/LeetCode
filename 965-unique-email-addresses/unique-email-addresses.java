class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniEmails = new HashSet<>();
        
        for(int i = 0; i<emails.length; i++){
            boolean local = true;
            boolean ignore = false;
            String email = "";
            for(int j = 0; j<emails[i].length(); j++){

                if(emails[i].charAt(j) == '@'){
                    local = false;
                    ignore = false;
                    email += emails[i].charAt(j);
                    continue;
                }
                if(emails[i].charAt(j) == '+' && local){
                    ignore = true;
                    continue;
                }
                if(ignore){
                    continue;
                }
                if(emails[i].charAt(j) == '.' && local){
                    continue;
                }
                
                
                
               
                email += emails[i].charAt(j);
            }
            
            uniEmails.add(email);
          
        }
        
        return uniEmails.size();
    }
}