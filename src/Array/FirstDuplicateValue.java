package Array;

public class FirstDuplicateValue {
    class Program {
        //T: O(n) / S: O(1)
        public int firstDuplicateValue(int[] array) {
            // Write your code here.
            for(int value:array){
                int absValue = Math.abs(value);
                if(array[absValue-1] < 0) return absValue;
                array[absValue-1] *= -1;
            }
            return -1;
        }
    }

}
