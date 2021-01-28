package Array;

public class LongestPeak {

    public static int longestPeakBetterSolution(int[] arr) {
        // Write your code here.
        int res=0;
        int i=1;
        while(i<arr.length){

            while(i<arr.length && arr[i]== arr[i-1]){
                i++;
            } //flat

            int up=0;

            while(i<arr.length && arr[i-1] < arr[i]){
                up++;
                i++;
            }

            int down =0;
            while(i<arr.length && arr[i-1] > arr[i]){
                down++;
                i++;
            }

            if(down>0 && up>0){
                res= Math.max((up+down+1),res   );
            }

        }

        return res;
    }



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
