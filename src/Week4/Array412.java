package Week4;

import java.util.*;

/*
412. Fizz Buzz
Easy

995

1329

Add to List

Share
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
* */
class Solution412 {

    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= n; i++){

            boolean divisibleByThree = (i%3 == 0);
            boolean divisibleByFive = (i%5 ==0);

            if(divisibleByThree && divisibleByFive) res.add("FizzBuzz");
            else if(divisibleByThree) res.add("Fizz");
            else if(divisibleByFive) res.add("Buzz");
            else res.add(Integer.toString(i));


        }
        return res;
    }
}
