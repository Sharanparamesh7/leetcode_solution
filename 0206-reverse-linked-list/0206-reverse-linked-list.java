class Solution{
public ListNode reverseList(ListNode head) {
    Stack<Integer> newStack = new Stack<>();
    while(head != null){
        newStack.push(head.val);
        head = head.next;
    }

    ListNode reversed = new ListNode(-1);
    ListNode ptr = reversed;

    while(newStack.isEmpty() == false){
        ptr.next = new ListNode(newStack.pop());
        ptr = ptr.next;
    }
    return reversed.next;
}
}

