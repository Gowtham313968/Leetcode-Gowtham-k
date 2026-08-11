// Last updated: 8/11/2026, 2:14:43 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycleLength = (n - 1) * 2;
        int timeInCycle = time % cycleLength;
        if (timeInCycle < n) {
            return 1 + timeInCycle;
        } else {
            return n - (timeInCycle - (n - 1));
        }
    }
}
