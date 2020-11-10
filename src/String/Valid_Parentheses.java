package String;

/*
20. Valid Parentheses
Easy

6044

248

Add to List

Share
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

* */
import java.util.*;
public class Valid_Parentheses {
    class Solution {
        public boolean isValid(String str) {
            Stack<Character> stack = new Stack<>();

            for(int i=0; i< str.length(); i++){
                char bracket = str.charAt(i);
                if(bracket == '(') stack.push(')');
                else if(bracket == '{') stack.push('}');
                else if(bracket == '[') stack.push(']');
                else{
                    if(stack.isEmpty() || stack.pop() != bracket)
                        return false;
                }
            }
            return stack.isEmpty();
        }
    }
}
