// Last updated: 8/11/2026, 2:15:15 PM
class Solution {

    public boolean makeEqual(String[] words) {

        int[] count = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
        }

        int n = words.length;

        for (int x : count) {
            if (x % n != 0) {
                return false;
            }
        }

        return true;
    }
}