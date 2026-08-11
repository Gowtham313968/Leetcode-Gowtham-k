// Last updated: 8/11/2026, 2:13:41 PM
class Solution {
    public int maxDistance(String moves) {
        int up = 0, down = 0, left = 0, right = 0, blanks = 0;

        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'U':
                    up++;
                    break;
                case 'D':
                    down++;
                    break;
                case 'L':
                    left++;
                    break;
                case 'R':
                    right++;
                    break;
                case '_':
                    blanks++;
                    break;
            }
        }

        int x = right - left;
        int y = up - down;

        return Math.abs(x) + Math.abs(y) + blanks;
    }
}