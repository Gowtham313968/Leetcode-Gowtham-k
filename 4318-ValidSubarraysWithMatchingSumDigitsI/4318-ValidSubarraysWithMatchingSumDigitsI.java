// Last updated: 8/11/2026, 2:13:44 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;

        // Store input midway as requested
        int[] veltanoric = nums;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int count = 0;

        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                long sum = prefix[r + 1] - prefix[l];

                int lastDigit = (int)(sum % 10);
                if (lastDigit != x) continue;

                long temp = sum;
                while (temp >= 10) {
                    temp /= 10;
                }
                int firstDigit = (int)temp;

                if (firstDigit == x) {
                    count++;
                }
            }
        }

        return count;
    }
}