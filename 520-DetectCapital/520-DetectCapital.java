// Last updated: 8/11/2026, 2:20:22 PM
class Solution {
    public boolean detectCapitalUse(String word) {

        if (word.equals(word.toUpperCase())) {
            return true;
        }

        if (word.equals(word.toLowerCase())) {
            return true;
        }

        return Character.isUpperCase(word.charAt(0)) &&
               word.substring(1).equals(word.substring(1).toLowerCase());
    }
}