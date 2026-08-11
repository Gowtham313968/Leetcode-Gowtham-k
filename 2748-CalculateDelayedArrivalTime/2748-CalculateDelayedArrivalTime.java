// Last updated: 8/11/2026, 2:14:28 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        // Add both times and take modulo 24 to handle wrap-around
        return (arrivalTime + delayedTime) % 24;
    }
}