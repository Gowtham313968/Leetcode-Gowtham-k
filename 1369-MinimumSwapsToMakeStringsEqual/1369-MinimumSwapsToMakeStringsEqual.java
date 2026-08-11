// Last updated: 8/11/2026, 2:16:24 PM
class Solution {
    public int minimumSwap(String s1, String s2) {
        int xy = 0;
        int yx = 0;

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (a == 'x' && b == 'y') {
                xy++;
            } else if (a == 'y' && b == 'x') {
                yx++;
            }
        }

        if ((xy + yx) % 2 == 1) {
            return -1;
        }

        int swaps = xy / 2 + yx / 2;

        if (xy % 2 == 1) {
            swaps += 2;
        }

        return swaps;
    }
}