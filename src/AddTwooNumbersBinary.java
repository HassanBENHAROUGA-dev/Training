import java.util.List;

public class AddTwooNumbersBinary {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode currentNode = result;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
                int sum = x + y + carry;

                carry = sum / 10;
                int digit = sum % 10;
                currentNode.next  = new ListNode(digit);
                currentNode = currentNode.next;
            System.out.println(currentNode.val);
                if(l1 != null){ l1 = l1.next;}
                if(l2 != null){ l2 = l2.next;}
        }
        return result.next;
    }
    public static void main(String[] args) {
        AddTwooNumbersBinary addTwooNumbersBinary = new AddTwooNumbersBinary();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(addTwooNumbersBinary.addTwoNumbers(l1, l2));
    }
}

