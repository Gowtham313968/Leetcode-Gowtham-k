// Last updated: 8/11/2026, 2:15:39 PM
class Solution {

    public boolean halvesAreAlike(String s) {

        int count = 0;

        String vowels = "aeiouAEIOU";
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count--;
            }
        }

        return count == 0;
    }
}