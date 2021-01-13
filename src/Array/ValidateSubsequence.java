package Array;
import java.util.*;
public class ValidateSubsequence {


    class Program {
        public  boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
            // Write your code here.
            int seqIndex=0;

            for(int i=0; i < array.size(); i++ ){
                int curTarget = sequence.get(seqIndex);
                if(array.get(i) == curTarget){
                    seqIndex++;
                }
                if(seqIndex == sequence.size()){
                    return true;
                }
            }

            return false;
        }
    }

}
