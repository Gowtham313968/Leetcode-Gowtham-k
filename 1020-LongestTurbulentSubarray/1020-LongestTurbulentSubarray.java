// Last updated: 8/11/2026, 2:17:34 PM
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;

        int up = 1;
        int down = 1;
        int maxLen = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                up = down + 1;
                down = 1;
            } 
            else if (arr[i] < arr[i - 1]) {
                down = up + 1;
                up = 1;
            } 
            else {
                up = 1;
                down = 1;
            }

            maxLen = Math.max(maxLen, Math.max(up, down));
        }

        return maxLen;
    }
}