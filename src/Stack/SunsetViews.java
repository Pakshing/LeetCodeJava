package Stack;

import java.util.*;
public class SunsetViews {
    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int cur=-1;
        int max= -1;
        if(direction.equals("EAST")){
            for(int i=0; i < buildings.length; i++){
                stack.add(buildings[i]);
            }
            int n = buildings.length-1;
            while(!stack.isEmpty()){
                cur = stack.pop();
                if(cur>max){
                    res.add(n);
                    max = cur;
                }
                n--;
            }
            Collections.reverse(res);
        }else{
            for(int i=0; i<buildings.length; i++){
                cur = buildings[i];
                if(cur>max){
                    res.add(i);
                    max = cur;
                }
            }
        }

        return res;
    }


}
