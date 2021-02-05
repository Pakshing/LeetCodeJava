package LinkedList;

public class RemoveDuplicateNode {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList list) {
        // Write your code here.
        LinkedList curNode = list;
        while(curNode.next != null){
            if(curNode.value == curNode.next.value){
                LinkedList next = curNode.next.next;
                curNode.next = next;
            }else{
                curNode = curNode.next;
            }
        }


        return list;
    }
}
