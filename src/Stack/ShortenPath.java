package Stack;

import java.util.*;
public class ShortenPath {
    public static String shortenPath(String path) {
        // Write your code here;
        boolean startWithSlash = path.charAt(0)=='/';
        String[] tokens = path.split("/");
        ArrayList<String> usefulTokens = removeUselessTokens(tokens);
        Stack<String> stack = new Stack<>();

        if(startWithSlash) stack.push("");

        for(int i=0; i < usefulTokens.size(); i++){
            if(usefulTokens.get(i).equals("..")){
                if(stack.isEmpty() || stack.peek().equals("..") ){
                    stack.push(usefulTokens.get(i));
                }else{
                    if(stack.size() != 0 && !(stack.peek().equals("")) ){
                        stack.pop();
                    }
                }
            }else{
                stack.push(usefulTokens.get(i));
            }

        }
        String res = String.join("/",stack);
        if(stack.size() ==1 && stack.peek().equals("") ) return "/";

        return res;
    }



    public static ArrayList<String> removeUselessTokens(String[] tokens){
        ArrayList<String> usefulTokens = new ArrayList<>();
        for(String token:tokens){
            if(  ! (token.equals(".")||token.equals("") )   ){
                usefulTokens.add(token);
            }
        }
        return usefulTokens;
    }
}
