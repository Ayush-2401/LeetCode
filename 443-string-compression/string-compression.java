class Solution {
    public int compress(char[] chars) {
        char check = chars[0];
        int count = 0;
        String comp = "";
        if(chars.length == 1){
            return 1;
        }
        for(int i = 0; i<chars.length; i++){
            if(chars[i] == check){
                count++;
            }else{
                if(count == 1){
                    comp += check;
                    check = chars[i];
                    count = 1;
                }else{
                    comp += check+Integer.toString(count);
                    check = chars[i];
                    count = 1;
                }
            }
            if(i == chars.length-1){
                if(count == 1){
                    comp += check;
                }else
                comp += check+Integer.toString(count);
            }
        }
        for(int i = 0; i<comp.length(); i++){
            chars[i] = comp.charAt(i);
        }
        return comp.length();
    }
}