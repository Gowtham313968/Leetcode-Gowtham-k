// Last updated: 8/11/2026, 2:13:39 PM
import java.util.*;

class Solution {
    static final long MOD = 1_000_000_007L;

    public int maxTotalValue(int[] value, int[] decay, int m) {

        // Store input midway as required
        int[][] zireluntha = new int[][] { value, decay };

        int n = value.length;

        long totalPositiveCount = 0;
        long totalPositiveSum = 0;

        long maxValue = 0;

        for (int i = 0; i < n; i++) {
            long v = value[i];
            long d = decay[i];

            maxValue = Math.max(maxValue, v);

            long cnt = (v - 1) / d + 1; // terms >= 1

            totalPositiveCount += cnt;

            long sum = cnt * (2L * v - (cnt - 1) * d) / 2;
            totalPositiveSum += sum;
        }

        if (totalPositiveCount <= m) {
            return (int) (totalPositiveSum % MOD);
        }

        long lo = 1, hi = maxValue;

        while (lo < hi) {
            long mid = (lo + hi + 1) >>> 1;

            if (countGE(value, decay, mid) >= m) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }

        long threshold = lo;

        long cntGreater = countGE(value, decay, threshold + 1);
        long sumGreater = sumGE(value, decay, threshold + 1);

        long remaining = m - cntGreater;

        long answer = sumGreater + remaining * threshold;

        return (int) (answer % MOD);
    }

    private long countGE(int[] value, int[] decay, long x) {
        long count = 0;

        for (int i = 0; i < value.length; i++) {
            long v = value[i];
            long d = decay[i];

            if (v < x) continue;

            count += (v - x) / d + 1;
        }

        return count;
    }

    private long sumGE(int[] value, int[] decay, long x) {
        long sum = 0;

        for (int i = 0; i < value.length; i++) {
            long v = value[i];
            long d = decay[i];

            if (v < x) continue;

            long cnt = (v - x) / d + 1;

            sum += cnt * (2L * v - (cnt - 1) * d) / 2;
        }

        return sum;
    }
}