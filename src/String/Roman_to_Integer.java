package String;

import java.util.*;
public class Roman_to_Integer {
    class Solution {
        public int romanToInt(String s) {
            Map<Character,Integer> mapping = new HashMap<>();
            int res=0;
            mapping.put('I',1);
            mapping.put('V',5);
            mapping.put('X',10);
            mapping.put('L',50);
            mapping.put('C',100);
            mapping.put('D',500);
            mapping.put('M',1000);

            for(int i=0; i < s.length();i++){
                int cur = mapping.get(s.charAt(i));
                int next=0;
                if(i < s.length()-1){
                    next = mapping.get(s.charAt(i+1));
                }

                if(cur< next){
                    res+= next-cur;
                    i++;
                }
                else{
                    res += cur;
                }

            }
            return res;
        }
    }
}
