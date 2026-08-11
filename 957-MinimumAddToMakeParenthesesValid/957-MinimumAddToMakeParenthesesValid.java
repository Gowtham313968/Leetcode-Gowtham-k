// Last updated: 8/11/2026, 2:17:52 PM
class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == '(' && ch == ')')
                stack.pop();
            else
                stack.push(ch);
        }

        return stack.size();
    }
}