// Last updated: 8/11/2026, 2:16:16 PM
class Solution {
    public int numberOfSteps(int num) {
        int s = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            s++;
        }
        return s;
    }
}

    
