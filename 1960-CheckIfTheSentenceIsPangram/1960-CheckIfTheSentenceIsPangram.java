// Last updated: 8/11/2026, 2:15:23 PM
class Solution {

    public boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean value : seen) {
            if (!value) {
                return false;
            }
        }

        return true;
    }
}