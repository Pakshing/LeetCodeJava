package BinaryTree;

import java.util.*;

public class SumOfLinkedLists {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        // Write your code here.
        LinkedList headOne = reverseLinkedList(linkedListOne);
        LinkedList headTwo = reverseLinkedList(linkedListTwo);


        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        while(headOne != null){
            str1.append(headOne.value);
            headOne = headOne.next;
        }

        while(headTwo != null){
            str2.append(headTwo.value);
            headTwo = headTwo.next;
        }



        int sum = Integer.parseInt(str1.toString()) + Integer.parseInt(str2.toString());

        System.out.println(sum);

        LinkedList newHead = new LinkedList(-1);
        LinkedList cur = newHead;
        ArrayList<Integer> nums = new ArrayList<>();

        if(sum == 0){
            return new LinkedList(0);
        }

        while(sum != 0 ){
            int num = sum%10;
            sum /= 10;
            nums.add(num);
        }


        for( int i = 0 ; i < nums.size(); i++){
            cur.next = new LinkedList(nums.get(i));
            cur = cur.next;
        }

        return newHead.next;
    }


    public static LinkedList reverseLinkedList(LinkedList head){


        LinkedList prev = null;
        LinkedList cur = head;
        LinkedList next = null;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }


        return prev;
    }
}
