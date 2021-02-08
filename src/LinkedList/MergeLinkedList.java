package LinkedList;

public class MergeLinkedList {
    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }


    public static LinkedList mergeLinkedLists1(LinkedList headOne, LinkedList headTwo) {
        // Write your code here.
        // O(n+m) T || O(1) S
        LinkedList p1 = headOne;
        LinkedList p2 = headTwo;
        LinkedList prev = null;

        while(p1 != null && p2 != null){
            if(p1.value < p2.value){
                prev = p1;
                p1 = p1.next;


            }else{
                if(prev != null) prev.next = p2;
                prev = p2;
                p2 = p2.next;
                prev.next = p1;
            }
        }

        if(p1==null) prev.next =p2;


        return headOne.value<headTwo.value? headOne: headTwo;
    }

    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        // Write your code here.
        // O(n+m) T || O(n+m) S
        LinkedList newHead = new LinkedList(-1);
        LinkedList l3 = newHead;

        while (headOne != null && headTwo != null){
            if(headOne.value < headTwo.value){
                l3.next = new LinkedList(headOne.value);
                headOne = headOne.next;
            }else{
                l3.next = new LinkedList(headTwo.value);
                headTwo = headTwo.next;
            }

            l3 = l3.next;
        }

        if (headOne == null){
            l3.next = headTwo;
        }

        if (headTwo == null ){
            l3.next = headOne;
        }



        return newHead.next;
    }




}
