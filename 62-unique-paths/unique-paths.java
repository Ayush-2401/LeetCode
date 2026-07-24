class Solution {
    public int uniquePaths(int m, int n) {
        m = m-1;
        n = n-1;

        int total = m+n;
        int k = Math.min(m,n);
        long answer = 1;
        for(int i = 1; i<=k; i++){
            answer = answer*(total-k+i);
            answer = answer/i;
        }
        return (int)answer;

    }
}