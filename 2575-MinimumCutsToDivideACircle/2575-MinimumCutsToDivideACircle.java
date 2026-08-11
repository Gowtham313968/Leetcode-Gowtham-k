// Last updated: 8/11/2026, 2:14:46 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0){
            return n/2;
        }
        return n;
    }
}