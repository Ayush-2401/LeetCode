class Solution {
    public long maxDif(int arr[], int k){
        if(arr.length == 1){
            return Math.max(Math.abs(arr[0]-k), Math.abs(arr[0]-0));
        }
        Arrays.sort(arr);
        int i = 1;
        long max = arr[0];
        while(i<arr.length){
            if(Math.abs(arr[i]-arr[i-1])>max){
                max = Math.abs(arr[i]-arr[i-1]);
            }
            i++;
       }
       max = Math.max(max, k - arr[arr.length-1]);
       return max;
    }

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long higth = maxDif(horizontalCuts, h);
        long width = maxDif(verticalCuts, w);
        long MOD = 1_000_000_007L;
        return (int) ((higth*width)%MOD);


    }
}