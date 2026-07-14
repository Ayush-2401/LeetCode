class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        String vow = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);

        while(left<right){
            if(vow.indexOf(sb.charAt(left)) != -1 && vow.indexOf(sb.charAt(right)) != -1){
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
            if(vow.indexOf(sb.charAt(left)) == -1){
                left++;
            }
            if(vow.indexOf(sb.charAt(right)) == -1){
                right--;
            }
        }
        return sb.toString();
    }
}