package LinkedList;

public class RevertLinkedList {
    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.
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

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
