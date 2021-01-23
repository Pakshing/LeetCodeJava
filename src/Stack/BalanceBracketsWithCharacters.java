package Stack;

import java.util.*;

public class BalanceBracketsWithCharacters {
    public static boolean balancedBrackets(String str) {
        // Write your code here.
        String openBrackets = "([{";
        String closeBrackets = ")]}";

        Stack<Character> stack = new Stack<>();

        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == '(' ){
                stack.push(')');
            }else if( str.charAt(i) == '['){
                stack.push(']');
            }else if( str.charAt(i) == '{' ){
                stack.push('}');
            }else if( openBrackets.indexOf(str.charAt(i)) == -1 && closeBrackets.indexOf(str.charAt(i)) ==-1){
                continue;
            }else{ //getting closing brackets
                if(stack.isEmpty() || str.charAt(i) != stack.pop()){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
