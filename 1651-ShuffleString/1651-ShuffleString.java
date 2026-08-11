// Last updated: 8/11/2026, 2:15:55 PM
class Solution {
    public String restoreString(String s, int[] indices) {

        char[] ans = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }

        return new String(ans);
    }
}