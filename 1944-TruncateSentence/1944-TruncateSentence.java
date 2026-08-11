// Last updated: 8/11/2026, 2:15:32 PM
class Solution {

    public String truncateSentence(String s, int k) {

        String[] words = s.split(" ");

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < k; i++) {
            ans.append(words[i]);

            if (i != k - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}