package Array;

public class LongestPeak {
    public static int longestPeak(int[] arr) {
        // Write your code here.
        if(arr.length < 3) return 0;

        int maxRange = 0;

        for(int i=1; i < arr.length-1; i++){

            if( arr[i-1]<arr[i] && arr[i]>arr[i+1] ){ // the peak
                System.out.println("i: " +i);
                int curMax = findRange(arr,i);
                System.out.println(curMax);
                maxRange = Math.max(curMax,maxRange);
            }
        }

        return maxRange;
    }

    public static int findRange(int[] arr, int peak){
        int left = peak-1;
        int cur = peak;
        int right = peak+1;
        int range = 1;


        while(left >= 0){
            if(arr[left] < arr[cur]){
                range++;
                cur--;
                left--;
            }else{
                break;
            }

        }

        cur = peak;
        while(right <arr.length){
            if(arr[right] < arr[cur]){
                range++;
                cur++;
                right++;
            }else{
                break;
            }

        }

        return range;
    }
}
