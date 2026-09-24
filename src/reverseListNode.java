import java.util.List;

public class reverseListNode {


    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
    public static void main(String[] args) {
        reverseListNode addTwooNumbersBinary = new reverseListNode();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(addTwooNumbersBinary.reverseList(l1));
    }
}

