package add_two_numbers;

public class AddTwoNumbers {
    /**
     *  给出两个非空的链表用来表示两个非负的整数。
     *  其中，它们各自的位数是按照逆序的方式存储的，
     *  并且它们的每个节点只能存储一位数字。
     * @param l1    第一个链表
     * @param l2    第二个链表
     * @return  返回一个新的链表来表示它们的和
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode sum = newHead;
        int shi = 0;
        while(l1 != null || l2 != null || shi != 0){
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;
            int sumVal = l1Val+l2Val+shi;
            shi = sumVal / 10;
            ListNode ln1 = new ListNode(sumVal % 10);
            sum.next = ln1;
            sum = ln1;

            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;

        }
        return newHead.next;
    }

    /**
     * 链表类
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
