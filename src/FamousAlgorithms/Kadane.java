package FamousAlgorithms;

public class Kadane {
    public static int kadanesAlgorithm(int[] arr) {
        // Write your code here.
        if(arr.length ==0) return 0;
        int max=arr[0];
        int cur =0;

        for(int i =0; i < arr.length; i++){
            cur  += arr[i];
            if(cur < arr[i]) cur=arr[i];
            max = Math.max(cur,max);

        }
        return max;
    }
}
