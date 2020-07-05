package Week1;/*
1323. Maximum 69 Number

Given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).



Example 1:

Input: num = 9669
Output: 9969
Explanation:
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
Example 2:

Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.
Example 3:

Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.


Constraints:

1 <= num <= 10^4
num's digits are 6 or 9.
*/


class Solution1323 {
    public int maximum69Number (int num) {
        int add =0;
        int temp =num;
        int digit =1;
        int d =0;


        while(temp >0){
            d = temp%10;
            temp /= 10;
            if(d == 6){
                add = 3*digit;
            }
            digit *= 10;

        }
        return num+add;
    }
}
