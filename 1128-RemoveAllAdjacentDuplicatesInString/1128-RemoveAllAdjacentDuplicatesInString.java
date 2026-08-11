// Last updated: 8/11/2026, 2:17:22 PM
class Solution {
    public String removeDuplicates(String s) {

        StringBuilder stack = new StringBuilder();

        for(char c : s.toCharArray()) {

            int length = stack.length();

            if(length != 0 && stack.charAt(length - 1) == c) {

                // Pop operation
                stack.setLength(length - 1);

            } else {

                // Push operation
                stack.append(c);
            }
        }

        return stack.toString();
    }
}