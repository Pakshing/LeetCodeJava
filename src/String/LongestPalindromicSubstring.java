package String;

public class LongestPalindromicSubstring {
    public static String longestPalindromicSubstring(String str) {
        // Write your code here.
        //O(n^2) time | o(n) space
        int[] curLongest = new int[] {0,1};
        for(int i=1; i < str.length(); i++){
            int[] odd = longestPalindromFrom(i-1, i+1, str );
            int[] even = longestPalindromFrom(i-1,i,str);

            //compare the max length of the palindrome
            int[] curMax = odd[1]-odd[0] > even[1]-even[0] ? odd:even;
            curLongest = curMax[1]-curMax[0] > curLongest[1]-curLongest[0] ? curMax: curLongest;

        }

        return str.substring(curLongest[0],curLongest[1]);
    }

    public static int[] longestPalindromFrom(int left, int right, String str){
        while(left >= 0 && right< str.length()){
            if(str.charAt(left) != str.charAt(right)){
                break;
            }
            left--;
            right++;
        }
        return new int[] {left+1,right};
    }
}
