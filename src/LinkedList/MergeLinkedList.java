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
