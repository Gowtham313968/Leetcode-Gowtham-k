// Last updated: 8/11/2026, 2:15:58 PM
class Solution {
    public int minInsertions(String s) {
        int res = 0;
        int need = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                need += 2;

                if (need % 2 == 1) {
                    res++;
                    need--;
                }
            } else {
                need--;

                if (need == -1) {
                    res++;
                    need = 1;
                }
            }
        }

        return res + need;
    }
}