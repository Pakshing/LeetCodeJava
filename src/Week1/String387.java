package Week1;

/*
387. First Unique Character in a String
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.


Note: You may assume the string contains only lowercase English letters.


* */

class Solution387 {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];

        //1st traverse - count the element
        for(int i=0; i < s.length(); i++){
            int index = s.charAt(i)-'a';
            arr[index] +=1;
        }

        for(int i=0; i < s.length(); i++){
            int index = s.charAt(i)-'a';
            if(arr[index] == 1){
                return i;
            }
        }

        return -1;
    }
}