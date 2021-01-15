package String;

import java.util.*;
public class RunLengthEncoding {
    public String runLengthEncoding(String str) {
        // Write your code here.
        StringBuilder res = new StringBuilder();
        int count =1;
        for(int i=0; i < str.length(); i++){

            while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1) && count <9){
                count++;
                i++;
            }

            res.append(count);
            res.append(str.charAt(i));
            count =1;
        }
        return res.toString();
    }
}
