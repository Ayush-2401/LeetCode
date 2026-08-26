class Solution {
    public int longestMountain(int[] arr) {
        int left = 0;
        int right = 1;
        int longest = 0;

        boolean increasing = false;
        boolean decreasing = false;

        while (right < arr.length) {

            // Going UP
            if (arr[right] > arr[right - 1]) {

                // If we were already going DOWN,
                // the previous mountain ended and this can
                // be the start of a new mountain.
                if (decreasing) {
                    left = right - 1;
                    decreasing = false;
                }

                increasing = true;
                right++;
            }

            // Going DOWN
            else if (arr[right] < arr[right - 1]) {

                // We can only go DOWN if we previously went UP.
                if (increasing) {
                    decreasing = true;
                    right++;

                    longest = Math.max(longest, right - left);
                } 
                else {
                    // Purely decreasing sequence.
                    left = right;
                    right++;
                }
            }

            // Equal elements break everything.
            else {
                left = right;
                right++;
                increasing = false;
                decreasing = false;
            }
        }

        return longest;
    }
}