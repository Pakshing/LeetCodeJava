package String;

/**
 *Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 *
 * Note:
 *
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * Accepted
 * 232,097
 * Submissions
 * 484,753
 */
public class Add_String {
    class Solution {
        public String addStrings(String num1, String num2) {
            int p1 = num1.length() -1;
            int p2 = num2.length() -1;
            int carry =0;
            StringBuilder res = new StringBuilder();
            int digit1 = 0;
            int digit2 = 0;

            while(p1 >=0 || p2>=0){
                digit1 = p1>=0? num1.charAt(p1) - '0': 0;
                digit2 = p2>=0? num2.charAt(p2) - '0': 0;
                p1--;
                p2--;
                int sum = digit1+digit2+carry;
                carry = sum/10;
                int reminder = sum%10;
                res.append(reminder);
            }
            if(carry !=0){
                res.append(carry);
            }

            return res.reverse().toString();
        }

    }
}
